package com.jee.java.part04;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("당첨 번호가 어떻게 되세요? ");
        int number = scanner.nextInt();

        if (number > 10) {
            System.out.println("당첨 번호는 1~10 사이에만 있어요.");
        } else { // have to separate else and if if we want to end the statement that is written above
            if (number % 2 == 0) {
                System.out.println("짝수네요, 모자 선물입니다!");
            } else {
                System.out.println("홀수네요, 인형 선물입니다!");
            }
        }
    }
}
