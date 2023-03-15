import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class test1{
        public static void main(String[] args){
                //改行
                System.out.println("問１");
                //問題1:下記条件になるようログの出力を行いなさい。
                Logger logger = Logger.getLogger(test1.class.getName());

                try {
                	FileHandler fHandler = new FileHandler("middleskill.log",true);
                	fHandler.setFormatter(new SimpleFormatter());
                	logger.addHandler(fHandler);


                	throw new IllegalArgumentException();

//                	String str2 = "Programmer Life";
//                	int num = Integer.parseInt(str2); // NumberFormatException
//                	System.out.println(num);

                } catch (NumberFormatException e) {
                	System.out.println(logger);
                }catch (IOException e) {
//                    e.printStackTrace();
                }
                logger.finest("ミドルスキルログが発生しました。");

//
//                //条件１ 例外でヌルポが発生させヌルポをキャッチした場合のみログ出力がされるプログラムにする事
//                //条件２ "middleskill log"という名前のログのインスタンスを生成する事
//                //条件３ srcディレクトリ内に"middleskill.log"としてログ出力される設定にする事
//                //条件４ ログの内容はコンソールに出ている赤文字と同じ内容のものが表示される事
//                //条件５ 格納するログメッセージは"ミドルスキルログが発生しました。"という文言にする事



        }

}