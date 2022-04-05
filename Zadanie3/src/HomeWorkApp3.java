/**
 * Java 1. Homework 3
 *
 * @author BaranovA
 * @version 01.04.2022
 */

import java.util.Arrays;

 class HomeWorkApp3 {
     public static void main(String[] args) {
         invertArr();
         fillArr();
         changeArray();
         fillDiagonal();

     }

     static void invertArr() {
         int[] arr1 = {1, 0, 0, 1, 0, 1};
         for (int i = 0; i < arr1.length; i++) {
             arr1[i] = (arr1[i] ^ 1);
         }
         System.out.println(Arrays.toString(arr1));
     }

     static void fillArr() {
         int[] arr2 = new int[100];
         for (int i = 0; i < arr2.length; i++) {
             arr2[i] = i;
         }
         System.out.println(Arrays.toString(arr2));
     }

     static void changeArray(){
         int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
         for (int i = 0; i < arr.length; i++) {
             if (arr[i]<6) {
                 arr[i]=2*arr[i];
             }
         }
         System.out.println(Arrays.toString(arr));
     }

     static void fillDiagonal() {
         int[][] arr3 = new int[5][5];
         for (int i = 0; i < arr3.length; i++) {
             for (int j = 0; j < arr3.length; j++) {
                 if (i == j) {
                     arr3[i][j] = 1;
                 } else if (j == ((arr3.length) - i-1)) {
                     arr3[i][j] = 1;
                 }
             }
         }
         for (int i = 0; i < arr3.length; i++) {
             for (int j = 0; j < arr3.length; j++) {
                 System.out.print(arr3[i][j]);

             }System.out.println();

         }
     }
 }