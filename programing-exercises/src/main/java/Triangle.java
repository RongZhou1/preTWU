package main.java;

/**
 * Created by rzhou on 06/09/2017.
 */
public class Triangle {
    public void printAsterisk() {
        System.out.println("*");
    }

    public void drawHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void drawVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }
}
