package com.company;
import java.util.Scanner;

public class Main {

    public static void printSum(int a,int b){
        int sum=a+b;
        System.out.print("Sum is " +sum);
    }

    public static  void printDifference(int a,int b){
        int difference=a-b;
        System.out.print("Difference is " +difference);
    }

    public static  void printMultiple(int a,int b){
        int multiple=a*b;
        System.out.print("Multiple is " +multiple);
    }

    public static  void printDivision(int a,int b){
        double division= (double) a/b;
        System.out.print("Division is " +division);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello!") ;
        System.out.println("What do you want to do?") ;
        System.out.println(" press num 1 for sum \n press num 2 for difference \n press num s for multification \n press num 4 for division");
        System.out.print("\n press your option :") ;
        int value = input.nextInt();

        System.out.print("Enter the First number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second number : ");
        int num2 = input.nextInt();

        switch  (value) {
            case 1:
                printSum(num1,num2);
                break;
            case 2:
                printDifference(num1,num2);
                break;
            case 3:
                printMultiple(num1,num2);
                break;
            case 4:
                printDivision(num1,num2);
                break;
            default:
                System.out.println("Invalid operator");

            }
        }
    }