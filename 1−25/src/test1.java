import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class test1{
        public static void main(String[] args){
                //改行
                System.out.println("問１");
                //問題1:下記条件になるようログの出力を行いなさい。

                // Loggerインスタンスの生成
//               Logger sample_logger = Logger.getLogger("middleskill log");
//
//               // 現在のディレクトリ情報を取得
//               String path =  System.getProperty("user.dir");
//               path = new File(path, "middleskill.log").getPath();
//
//               // Handlerクラスのインスタンス生成のときの例外処理のためのtry-catch構文
//               try{
////            	   String str = null;
////                   if (str == null) {
////                       throw new NullPointerException();
////                   }
//                       // Handlerインスタンスを生成
//                         Handler sample_handler = new FileHandler(path);
//                            // LoggerにHandlerを登録
//                        sample_logger.addHandler(sample_handler);
//               }catch(IOException e){
////               } catch (NullPointerException e) {
////            	   sample_logger.log(Level.INFO, "ミドルスキルログが発生しました。");
////            	   System.out.println("数字フォーマットエラーが発生しました");
//               }
//
//               // ログの出力
//               sample_logger.log(Level.INFO, "ミドルスキルログが発生しました。");

                Logger logger = Logger.getLogger("middleskill log");
                FileHandler handler = null;
                try {
                    handler = new FileHandler("src/middleskill.log");

                    handler.setFormatter(new SimpleFormatter());
                    logger.addHandler(handler);
                    logger.setLevel(Level.INFO);
                    throw new NullPointerException();
                } catch (NullPointerException e) {
                    logger.log(Level.INFO, "ミドルスキルログが発生しました。",e);

                    // ここに例外を発生させる処理を記述

                } catch (SecurityException | IOException e) {

				}

//
//                //条件１ 例外でヌルポが発生させヌルポをキャッチした場合のみログ出力がされるプログラムにする事
//                //条件２ "middleskill log"という名前のログのインスタンスを生成する事
//                //条件３ srcディレクトリ内に"middleskill.log"としてログ出力される設定にする事
//                //条件４ ログの内容はコンソールに出ている赤文字と同じ内容のものが表示される事
//                //条件５ 格納するログメッセージは"ミドルスキルログが発生しました。"という文言にする事



        }

}