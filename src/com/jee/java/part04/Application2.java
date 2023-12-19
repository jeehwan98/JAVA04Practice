package com.jee.java.part04;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("짝홀, 그 결과는? ");
        int result = scanner.nextInt();

        if (result % 2 == 0) {
            System.out.println("짝수입니다!");
        } else {
            System.out.println("홀수입니다!");
        }
    }
}
