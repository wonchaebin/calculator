package org.example.calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //사용자의 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        //Calculator 클래스의 인스턴스 생성
        Calculator calculator = new Calculator();

        //무한 루프로 사용자와의 상호작용 반복
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요.: ");
            int first = scanner.nextInt();

            System.out.print("사칙연산 기호를 입력하세요.: ");
            char operator = scanner.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요.: ");
            int second = scanner.nextInt();
            scanner.nextLine();

            //Calculator 클래스의 calculator 메서드를 호출하여 결과 계산
            double result = calculator.calculate(first, operator, second);
            //계산 결과 출력
            System.out.println("결과: " + result);
            //지금까지 저장된 결과들 출력
            System.out.println("지금까지의 결과: " + calculator.getResults());

            System.out.print("가장 먼저 저장된 데이터를 삭제하시겠습니까? (Y/N) : ");
            String deleteInput = scanner.nextLine();

            if (deleteInput.equals("Y")) {
                calculator.removeResult();
                System.out.println("현재 결과 목록 : " + calculator.getResults());
            } else if (deleteInput.equals("N")) {
                System.out.println("삭제를 취소하셨습니다.");
            } else {
                System.out.println("올바른 값을 입력해주세요.");
            }
            //추가적인 계산 여부 확인
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");

            //사용자의 입력을 문자열(String)로 받기
            String input = scanner.nextLine();

            //사용자가 "exit" 입력 시 프로그램 종료
            if (input.equals("exit")) {
                break;

            }
        }
    }
}