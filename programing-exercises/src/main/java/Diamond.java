package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rzhou on 06/09/2017.
 */
public class Diamond {


    private String printAsterisk(int count) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < count; i++) {
            str.append("*");
        }
        return str.toString();
    }

    private String printSpace(int count) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < count; i++) {
            str.append(" ");
        }
        return str.toString();
    }

    private List<String> buildIsoscelesTriangle(int n) {
        List<String> strList = new ArrayList<>();
        String item = "";
        for (int i = 0; i < n; i++) {
            item = printSpace(n - i - 1) + printAsterisk(2 * i + 1) + "\n";
            strList.add(item);
        }
        return strList;
    }

    public void drawIsoscelesTriangle(int n) {
        List<String> strList = buildIsoscelesTriangle(n);
        for (String str :
                strList) {
            System.out.print(str);
        }
    }

    private List<String> buildInverseIsoscelesTriangle(int n) {
        List<String> strList = new ArrayList<>();
        String item = "";
        for (int i = 0; i < n; i++) {
            item = printSpace(i) + printAsterisk((n - i) * 2 - 1) + "\n";
            strList.add(item);
        }
        return strList;
    }


    public void drawDiamond(int n) {
        List<String> strList = buildIsoscelesTriangle(n);
        for (String str :
                strList) {
            System.out.print(str);
        }
        List<String> strList2 = buildInverseIsoscelesTriangle(n);
        for (int i = 1; i < strList2.size(); i++) {
            System.out.print(strList2.get(i));
        }
    }

    public void drawDiamondWithName(int n, String name) {
        List<String> strList = buildIsoscelesTriangle(n);
        for (int i = 0; i < strList.size() - 1; i++) {
            System.out.print(strList.get(i));
        }
        System.out.println(name);
        List<String> strList2 = buildInverseIsoscelesTriangle(n);
        for (int i = 1; i < strList2.size(); i++) {
            System.out.print(strList2.get(i));
        }
    }
}
