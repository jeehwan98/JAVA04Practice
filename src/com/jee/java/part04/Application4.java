package com.jee.java.part04;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("키를 입력해 주세요 (m) : ");
        float height = scanner.nextFloat();
        System.out.print("체중을 입력해 주세요 (kg) : ");
        float kg = scanner.nextFloat();

        double BMI = kg / Math.pow(height, 2);

        if (BMI < 20) {
            System.out.println("저체중입니다. 축제 음식을 왕창 드세요!");
        } else if (BMI < 25) {
            System.out.println("정상 체중입니다. 축제 재미있게 즐기세요~");
        } else if (BMI < 30) {
            System.out.println("축제에서 10,000보를 걷고 오시면 상품을 드려요!");
        } else {
            System.out.println("댄싱 부스에 참가하시고 도장을 받아오시면 선물을 드려요!");
        }
    }
}
