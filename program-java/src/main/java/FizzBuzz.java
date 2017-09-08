import java.util.Objects;

/**
 * Created by rzhou on 06/09/2017.
 */
public class FizzBuzz {

    void game(int n) {

        for (int i = 1; i < n + 1; i++) {
            String str = "";
            if (isMultiple(i,3)) {
                str += "Fizz";
            }
            if (isMultiple(i,5)) {
                str += "Buzz";
            }
            if (Objects.equals(str, "")) {
                str += i;
            }
            System.out.println(str);
        }
    }

    private  boolean isMultiple(int number, int base){
        return number % base == 0;
    }
}
