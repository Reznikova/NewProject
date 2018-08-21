package krug;

import java.util.Scanner;

public class SKrug {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("введите радиус круга");
        float R = abc.nextInt();
        float P = 3.14159f;
        float S = P*R*R;
               System.out.println("площадь круга равна" + " " + S);
    }
}
