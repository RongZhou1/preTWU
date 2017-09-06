package main.java;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

/**
 * Created by rzhou on 06/09/2017.
 */
public class PrimeFactors {
    public void generate(int n) {
        List<String> strList = new ArrayList<>();
        if (n > 1) {
            if (n % 2 == 0) {
                strList.add(Integer.toString(2));
            }
            for (int i = 3; i < sqrt(n); i += 2) {
                if (n % i == 0)
                    strList.add(Integer.toString(i));
            }
            if (strList.isEmpty()) {
                strList.add(Integer.toString(n));
            }
        }

        if (!strList.isEmpty()) {
            for (int i = 0; i < strList.size() - 1; i++) {
                System.out.print(strList.get(i) + ",");
            }
            System.out.print(strList.get(strList.size() - 1));
        } else
            System.out.print("");

    }
}
