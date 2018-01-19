//Daniel Anderson and Payton Green

import java.util.Scanner;


public class p7DanielAndersonClone2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will be read: ");
        int a[] = new int[input.nextInt()];
        numbers(a);

        System.out.println("The average is: " + average(a));
        System.out.println("The contents of the array: ");
        System.out.println(java.util.Arrays.toString(a));
    }

    public static void numbers(int a[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        average(a);
    }

    public static void print(int[] a) {

    }

    public static int average(int a[]) {
        int total = 0;
        for (int ar : a) {
            total += ar;

        }
        return total / a.length;
    }

    public static void printing(int a[]) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {

        }
    }
}
