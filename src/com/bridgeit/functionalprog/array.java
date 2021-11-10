-package com.bridgeit.functionalprog;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    Scanner sc = new Scanner(System.in);
    private int[][] makeTwoDArray() {


        System.out.println("Enter no of rows");
        int row = sc.nextInt();
        System.out.println("Enter no of columns");
        int column = sc.nextInt();

        int[][] twodarray = new int[row][column];
        return twodarray;
    }

    public int[][] popluateTwoDArray() {
        int[][] twoDArray=makeTwoDArray();

        for(int i=0;i<twoDArray.length;i++) {

            for(int j=0;j<twoDArray[i].length;j++) {
                System.out.println("Enter value to this array address["+i+"]"+"["+j+"]");
                int value = sc.nextInt();
                twoDArray[i][j]=value;
            }
        }
        sc.close();
        return twoDArray;
    }

    public  void convertToString(int arr[][])
    {

        for (int n = 0 ; n < arr.length ; n++)
        {
            System.out.println(Arrays.toString(arr[n]));
        }

    }

    public void print2DArray (int arr [][]) {

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Array2D arr = new Array2D();
        int[][] x= arr.popluateTwoDArray();
        //arr.convertToString(x);
        arr.print2DArray(x);


    }