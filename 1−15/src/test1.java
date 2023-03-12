import java.util.Arrays;
import java.util.Collections;

public class test1 {
        public static void main(String[] args) {
                //改行
                System.out.println("問１");
                //問１のメソッドを呼び出して出力してください（引数５と１０）
                //改行
                int result = add(5, 10);
                System.out.println(result); // 15

                System.out.println("問２");
                //問２のメソッドを呼び出して出力してください（引数"しんぶんし"）
                //改行
                String s = "しんぶんし";
                boolean results = isPalindrome(s);
                System.out.println(results);
                System.out.println("問３");
                //問3のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
                Integer [] i = {5,3,1,9,4,8};
                //改行
                sortDescending(i);
                System.out.println(Arrays.toString(i));
                System.out.println("問４");
                //問4のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
                int [] k = {5,3,1,9,4,8};
                int minIndex = findMinIndex(k);
                System.out.println(minIndex);
        }
        //問題1:2つの整数を受け取り、それらの和を返すメソッドを作成してください。
        public static int add(int x, int y) {
            return x + y;
        }
        //問題2:文字列を受け取り、その文字列が回文であるかどうかを返すメソッドを作成してください。
        public static boolean isPalindrome(String s) {
            if (s == null || s.length() <= 1) {
                return true;
            }
            int left = 0;
            int right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
        //問題3:整数の配列を受け取り、その配列の要素を降順にソートするメソッドを作成してください。(for文は利用しないこと)
        public static void sortDescending(Integer[] i) {
            Arrays.sort(i, Collections.reverseOrder());
        }
        //問題4:整数の配列を受け取り、その配列の中で最小値を持つ要素のインデックスを返すメソッドを作成してください。
        public static int findMinIndex(int[] arr) {
            int minIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            return minIndex;
        }

}