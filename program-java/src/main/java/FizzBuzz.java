/**
 * Created by rzhou on 06/09/2017.
 */
public class FizzBuzz {

    public void game(int n) {
        for (int i = 1; i < n + 1; i++) {
            String str = "";
            if (isThree(i)) {
                str += "Fizz";
            }
            if (isFive(i)) {
                str += "Buzz";
            }
            if (str == "") {
                str += i;
            }
            System.out.println(str);
        }
    }

    private boolean isThree(int n) {
        if (n % 3 == 0) {
            return true;
        }
        return false;
    }

    private boolean isFive(int n) {
        if (n % 5 == 0) {
            return true;
        }
        return false;
    }
}
