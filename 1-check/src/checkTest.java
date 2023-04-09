import java.util.Scanner;
import java.util.logging.Logger;
public class checkTest {
	//問7用
	private static final Logger LOGGER = Logger.getLogger(checkTest.class.getName());

	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問1 リソースを開く(ファイル名)ショートカットキーは何ですか？
		//		Ctr + Shift + R
		//改行


		System.out.println("問２");
		//問2 リファクタリングをする時のショートカットキーは何ですか？
		//		Shift + Alt + R
		//改行

		System.out.println("問３");
		//問3 デバッグを行う方法を簡潔に記載してください
		//		ブレークポイントを張る（Ctrl＋Shift＋B）
		//		デバッグ実行を開始（F11キー）
		//		ブレークポイントに止まる
		//改行

		System.out.println("問４");
		//問4 eclipseのバージョン8と11の違いを簡潔に答えてください
		//		変数の型を宣言せずに様々な型の変数を扱えるようになった
		//改行

		System.out.println("問５");
		//問5　Road博物館の入場料金は、一人1000円であるが、10人以上のチームなら一人820円、20人以上の団体なら一人700円である。人数を入力し、入場料の合計を計算するプログラムを作成せよ。(if文で上記文章を作ってください)
		int Admission =10;

		if(Admission>=20) {
			System.out.println(Admission*700);
		}else if(Admission>=10) {
			System.out.println(Admission*820);
		}else{
			System.out.println(Admission*1000);
		}
		//改行

		System.out.println("問６");
		//問6　コメントアウトされている箇所にどう言った処理が行われているか記載してください
		Scanner scn = new Scanner(System.in);
		int[] score = new int[5];
		int i, sum;
		double ave;

		//
		for (i = 0; i < score.length; i++) {
			System.out.print("得点を入力してください = ");
			score[i] = scn.nextInt();
		}

		//	50~53行目についての処理：for文でscoreを回し、nextIntメソッドに代入されてスコアとして格納される。

		//
		sum = 0;
		for (i = 0; i < score.length; i++) {
			sum += score[i];
		}

		//	58~61行目についての処理：sum変数に0を代入し、iをfor文で回してscoreの配列の数をsum変数に代入していく。

		//
		ave = sum / (double)score.length;
		//
		System.out.println("平均値 = " + ave);

		//	66行目についての処理：sum変数に入った値をscore変数（浮動小数点数）で割り、ave変数に代入する。

		//改行

		System.out.println("問７");
		//問7　ログ出力が行えるように下記コードを１箇所修正してください
		String message = "Hello World!";
		LOGGER.info("The message is: " + message);
		//		↓のように変更する。
		//		LOGGER.log("The message is: " + message);
		//改行

		System.out.println("問８");
		//問8　問題：
		//入力された文字列を整数に変換し、その結果を出力するプログラムを作成してください。ただし、以下の場合には例外を発生させてください。(Scannerメソッドを使用すること)
		//1.入力された文字列がnullの場合（NullPointerExceptionが発生する）
		//2.入力された文字列が空文字列の場合（Exceptionが発生する）
		//3.入力された文字列が整数に変換できない場合（NumberFormatExceptionが発生する）

//		Scanner scanner = new Scanner(System.in);
//        System.out.print("数字を入力してください: ");
//        String input = scanner.nextLine();
//
//        try {
//            if (input == null) {
//                throw new NullPointerException("入力がnullです。");
//            } else if (input=="") {
//                throw new Exception("入力が空です。");
//            } else {
//                int num = Integer.parseInt(input);
//                System.out.println("変換結果: " + num);
//            }
//        try {
//            int num = Integer.parseInt(input);
//            System.out.println(num);
//        } catch (NumberFormatException e) {
//            System.out.println("文字列を整数に変換できないです。");
//        }

		//改行

		System.out.println("問９");
		//問9 Java編終わった感想と改善点もしございましたらお願いします。
		//『ここに書いてね』

//		今の自分の実力だと例外処理は調べながらじゃないと結構キツかったです。😅
//		for文の処理やif文の処理などは
//		ローミドルの問題を解いたことや、寮のメンバーに教えアウトプットしたことで、
//		ある程度の力は付いたとは実感できました。👍
//		これからDBとspringとフロントとエラー対応について学んでいくので
//		寮にいることを有効活用して楽しみながらやって行きたいともいます🔥
	}
}
