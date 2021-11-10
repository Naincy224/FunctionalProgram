-package com.bridgeit.functionalprog;

import java.util.Scanner;

public class Quadratic {

    public void qurdratic() {
        double root1 = 0.00;
        double root2 = 0.00;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no. for A");
        int a = sc.nextInt();

        System.out.println("Enter a no. for B");
        int b = sc.nextInt();

        System.out.println("Enter a no. for C");
        int c = sc.nextInt();

        sc.close();

        double delta = (b * b) - (4 * a * c);

        if (delta > 0.0) {
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (delta == 0.0) {
            root1 = -b / (2.0 * a);
            System.out.println("The root is " + root1);
        } else {
            System.out.println("Roots are not real.");
        }

    }

    public static void main(String[] args) {

        Quadratic quadratic = new Quadratic();

        quadratic.qurdratic();
    }
}