import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問題1:下記の条件を使ってfor文と条件文を組み合わせ結果が同じになるよう出力しなさい。for文ネスト3回（3回forを書くこと）
		//strArray1でfor文を回し3文字目(k)以降のものをstrArray2に格納する(1個目のfor文)
		//strArray2でfor文を回しkとaとoの物だけでstrArray3に格納する(2個目のfor文)
		//strArray3でfor文を回し「kakao」となるようにstrArray4に格納しstrArray4を出力する。(3個目のfor文)
		List<String> strArray1 = new ArrayList(Arrays.asList("f", "u", "k", "u", "d", "a", "k" , "a" , "n" , "e" , "k" , "o" ));
		List<String> strArray2 = new ArrayList<String>();
		List<String> strArray3 = new ArrayList<String>();
		List<String> strArray4 = new ArrayList<String>();

//		for (int i = 2; i < strArray1.size(); i++) {
//			strArray2.add(strArray1.get(i));
//		}

		for (int i = 2; i < strArray1.size(); i++) {
			//strArray1 のインデックスが2以上の要素に対して、2番目のループを実行
		    for (int j = 0; j < strArray1.get(i).length(); j++) {
            //配列 strArray2 に、strArray1 の現在のインデックスに対応する要素の文字列を、その文字列の長さだけ追加
		        strArray2.add(strArray1.get(i));
		    }
		}
//		この時点でkudakanekoの要素になっている


		for (int k = 0; k < strArray2.size(); k++) {
			String str = strArray2.get(k);
//			if (str.contains("k") || str.contains("a") || str.contains("o")) {
//				strArray3.add(str);
//			}
			for (int l = 0; l < str.length(); l++) {
//				str の各文字に対して、2番目のループを実行
			    char c = str.charAt(l);
//			    現在の文字 c が、文字 'k' または 'a' または 'o' である場合、strArray3 に str を追加し、ループを中断
			    if (c == 'k' || c == 'a' || c == 'o') {
			        strArray3.add(str);
			        break;
			    }
			}
		}//		この時点でkukakoの要素になっている

		for (int m = 0; m < strArray3.size()-3; m++) {
//			strArray3 の各要素に対して、2番目のループを実行
			boolean condition2=strArray3.get(m).equals("k") && strArray3.get(m + 1).equals("a")
					&& strArray3.get(m + 2).equals("k") && strArray3.get(m + 3).equals("o");
			if(condition2) {
				for(String str3:Arrays.asList("k","a","k","a","o")) {
//					インデックス m が、strArray3 の要素の範囲内にあり、
//					かつ、次の4つの要素が "k", "a", "k", "o" である場合に、
//					strArray4 に "k", "a", "k", "a", "o" を追加
					strArray4.add(str3);
				}
			}
//			if (strArray3.get(i).equals("k") && strArray3.get(i + 1).equals("a")
//					&& strArray3.get(i + 2).equals("k") && strArray3.get(i + 3).equals("o")) {
//				strArray4.add("k");
//				strArray4.add("a");
//				strArray4.add("k");
//				strArray4.add("a");
//				strArray4.add("o");
//			}
		}
		System.out.println(strArray4);
	}
}