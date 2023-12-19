package com.jee.java.part04;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("first integer : ");
        int firstNum = scanner.nextInt(); // get the first integer into firstNum
        System.out.print("second integer : ");
        int secondNum = scanner.nextInt(); // get the second integer into secondNum
        System.out.print("type in the operator of use : ");
        char operator = scanner.next().charAt(0); // how to add this line?
        // char operator = sc.nextLine() ?? >> to get the actual character of what was inputted

        int result = 0; // reset the value of result to 0 in order to input new values into it...
        switch(operator) {
            case ('+'):
                result = firstNum + secondNum; break; // have to break, if not... add up all the values below...!
            case ('-'):
                result = firstNum - secondNum; break;
            case ('*'):
                result = firstNum * secondNum; break;
            case ('/'):
                result = firstNum / secondNum; break;
            case ('%'):
                result = firstNum % secondNum; break;
            default:
                System.out.println("wrote the wrong operator"); break;
        }

        System.out.println(firstNum + " " + operator + " "  + secondNum + " = " + result); // 다시 쓸것..!
    }
}
