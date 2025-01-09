package org.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //사용자 입력을 처리하기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        //while문을 통한 무한 루프로 계산 반복
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            //첫 번째 숫자를 입력받아 변수에 저장
            int first = scanner.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            //입력된 문자열의 첫 번째 문자를 연산자로 사용
            char operator = scanner.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            //두 번째 숫자를 입력받아 변수에 저장
            int second = scanner.nextInt();

            int result = 0; //계산 결과를 저장할 변수 초기화

            if (operator == '+') {
                result = first + second;
            } else if (operator == '-') {
                result = first - second;
            } else if (operator == '*') {
                result = first * second;
            } else if (operator == '/') {
                //0으로 나누는 행위 방지하기 위해 while문 처리
                while (second == 0) { //두 번째 숫자가 0이면 반복적으로 다시 입력 받음
                    System.out.print("0이 아닌 숫자를 다시 입력하세요: ");
                    second = scanner.nextInt();
                }
                result = first / second;
            }
            //계산 결과 출력
            System.out.println("결과: " + result);
            //추가적인 계산 여부 확인
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            //개행 문자 소비
            scanner.nextLine();
            if (scanner.nextLine().equals("exit")) { //사용자가 "exit" 입력 시 종료
                break; //반복문 종료
            }
        }
    }
}