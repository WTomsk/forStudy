/**
 * Java 1. Homework 2
 *
 * @author BaranovA
 * @version 28.03.2022
*/
public class Zadanie2 {
    public static void main(String[] args) {
        System.out.println(checkSumRange(10,1));

        printParamSign(-10);

        System.out.println(isNegativ(-10));
        printStringCount("Text", 5);
    }
    static boolean checkSumRange (int a, int b) {
        int sum = a + b;
            if (sum < 10) {
            System.out.println("Cумма меньше 10");
            return false;
        } else if (sum >10 && sum<= 20) {
            System.out.println("Cумма от 10 до 20 (включительно)");
            return true;
        } else {
            System.out.println("Cумма больше 20");
            return false;
        }
    }

    static void printParamSign(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    static boolean isNegativ(int x) {

        if (x <= 0) {
            System.out.println("Отрицательное");
            return true;
        }
        System.out.println("Положительное");
        return false;

    }

    static void printStringCount(String text, int count){
      for (int i=0; i < count; i++ ) {
          System.out.println("text");
      }
    }

}
