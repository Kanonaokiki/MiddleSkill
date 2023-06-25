package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.MiddleEntity;
import com.example.demo.form.MiddleForm;
import com.example.demo.service.MiddleService;

@Controller
public class MiddleController {
	@Autowired
	MiddleService middleService;

	@GetMapping("/private")
	public String top( Model model) {
		model.addAttribute("middleForm",new MiddleForm());
		//mapを使用して日付を表示
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    String formattedDate = dateFormat.format(new Date());
	    Map<String, Object> modelMap = model.asMap();
	    modelMap.put("formattedDate", formattedDate);

        //連想配列を使用して日付を表示
	 // フォーマットされた日付をMapに追加
	    Map<String, String> formattedDates = new HashMap<>();
	    formattedDates.put("date1", dateFormat.format(new Date()));
	    // フォーマットされた日付のMapをModelに追加
	    model.addAttribute("formattedDates", formattedDates);
		// 4．日付をフォーマットし出力
		return "/private";
	}

	@GetMapping("/privatelist")
	public String privateList( Model model) {
		// serviceを使って、申請の一覧をDBから取得する
		List<MiddleEntity> middlelist = middleService.findAll();
		model.addAttribute("middlelist", middlelist);

		SimpleDateFormat exDateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 3．パターンを指定
		Date exDate = new Date();   // 2．日付（今回は現在の日時）を取得
		System.out.println(exDateFormat.format(exDate));
		model.addAttribute("exDate", exDateFormat.format(exDate));
		// modelに経費の一覧を設定して、画面に渡す
		return "/privatelist";
	}

	@PostMapping("/private")
	public String privateInsert(@Validated @ModelAttribute MiddleForm middleForm,BindingResult bindingResult,Model model) {
		Logger logger = Logger.getLogger("middleskill log");
		FileHandler handler = null;
		try{
			handler = new FileHandler("src/middleskill.log");

		if (bindingResult.hasErrors()) {
			List<String> errorList = new ArrayList<String>();
			for (ObjectError error : bindingResult.getAllErrors()) {
				errorList.add(error.getDefaultMessage());
			}
			model.addAttribute("middleForm",middleForm);
			model.addAttribute("validationError", errorList);
			return "/private";
		}
		middleService.insert(middleForm);
		//		     // 経費一覧画面にリダイレクト
		return "redirect:/privatelist";


	} catch (Exception e) {
        // エラーログの出力
		logger.log(Level.INFO, "ミドルスキルログが発生しました。",e);
        e.printStackTrace();
        // 例外処理に応じた適切なエラーページにリダイレクトするなど、必要な処理を追加してください。
        return "error"; // エラーページのパスを指定
    }
	}

//	@PostMapping("/user/private/delete")
	  @GetMapping("/{id}")
	  public String delete(@PathVariable Integer id, Model model) {
	    // ユーザー情報の削除
		  middleService.delete(id);
	    return "redirect:/privatelist";
	  }
	public String delete(Integer id,MiddleForm middleForm, Model model) {
		// ユーザー情報の削除
		middleService.delete(id);
		return "redirect:/privatelist";
	}
}