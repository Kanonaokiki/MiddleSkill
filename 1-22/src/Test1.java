import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test1 {
        public static void main(String[] args) {
                String shinyaBirthday = "1998/03/19";
                String minamiBirthday = "2000/02/14";
                String furuyamaBirthday = "1998/09/12";
                //改行

                System.out.println("問１");
                //問題1:現在の時刻を出力してください
                //改行
                LocalDateTime now = LocalDateTime.now(); // 現在の日時を取得
                System.out.println(now);

                System.out.println("問２");
                //問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
                //改行
                LocalDate birthday1 = LocalDate.parse(shinyaBirthday, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
                LocalDate birthday2 = LocalDate.parse(minamiBirthday, DateTimeFormatter.ofPattern("yyyy/MM/dd"));

                LocalDate earlierDate = birthday1.isBefore(birthday2) ? birthday1 : birthday2;
                System.out.println(earlierDate);

                System.out.println("問３");
                //問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
                LocalDate birthday3 = LocalDate.parse(furuyamaBirthday, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
                LocalDate newDate = birthday3.plusYears(5).plusMonths(2);
                String result = newDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
                System.out.println(result);
        }
}