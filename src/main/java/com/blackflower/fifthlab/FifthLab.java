package com.blackflower.fifthlab;

public class FifthLab {

    public static void main(String[] args) {

        
        quiz2();
    }

    public static void First() {
        int num = 12;
        String result = "";
        while (num > 0) {
            result = (num % 2) + result;
            num /= 2;
        }
        System.out.println(result);

        num = 12;
        int binary = 0;
        for (int i = 0; num > 0; i++) {
            int reminder = num % 2;
            binary += (reminder * Math.pow(10, i));
            num /= 2;
            System.out.println(reminder);

        }
        System.out.println(binary);
    }

    public static void Second() {
        for (int i = 2; i < 7; i++) {

            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.print(factorial + " ");

            for (int j = 6; j > i; j--) {
                System.out.print(++factorial + " ");
            }
            System.out.println();
        }

        System.out.println("------------");

        int factorial = 1;
        for (int i = 2; i < 7; i++) {
            factorial *= i;
            System.out.print(factorial + " ");

            for (int j = 1; j < 7 - i; j++) {
                System.out.print((int) (factorial + j) + " ");
            }
            System.out.println();
        }
        
    }
    
    public void quiz1(){
        int num = 3;
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("x ");
            }
            
            System.out.print(num + " ");
            num += 3;
            
            for (int j = 0; j < i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
    
    private static void quiz2(){
        int num = 3;
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {               
                if (i == 5 - j) {
                    System.out.print(num + " ");
                    num+=3;                    
                }
                else{
                    System.out.print("x ");
                }
                
            }
            System.out.println("");
        }
    }
}
