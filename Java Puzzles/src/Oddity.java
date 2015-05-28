/**
 * Created by Narendran Solai on 5/21/15.
 */
public class Oddity {

    public static boolean isOdd(int i) {
        return i % 2 != 0;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(3));
        System.out.println(isOdd(2));
        System.out.println(isOdd(-9));
    }

}
