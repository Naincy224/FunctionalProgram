-package com.bridgeit.functionalprog;

import java.util.Scanner;

public class WindChill {

    public double windChillCalculator() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature:");
        double t = sc.nextDouble();

        System.out.println("Enter the wind speed:");
        double v = sc.nextDouble();
        sc.close();

        double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        return windChill;
    }

    public static void main(String[] args) {
        WindChill windChillObj = new WindChill();
        double windChill = windChillObj.windChillCalculator();
        System.out.println("Wind chill is:" + windChill);
    }

}