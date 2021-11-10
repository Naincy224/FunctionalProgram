-package com.bridgeit.functionalprog;

import java.util.Scanner;

public class Distance {

    public double euclideanDistance() {


        Scanner sc= new Scanner(System.in) ;

        System.out.println("Enter a no. for X");
        int x =sc.nextInt();

        System.out.println("Enter a no. for Y");
        int y =sc.nextInt();

        sc.close();
        double euclideanDistance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return euclideanDistance;

    }
    public static void main(String[] args) {

        Distance distance = new Distance();

        double euclidDist=distance.euclideanDistance();
        System.out.println("The euclidian distance is :"+ euclidDist );
    }
}