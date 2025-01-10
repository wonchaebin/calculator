package org.example.calculator2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    // 계산 결과를 저장하는 리스트
    private List<Double> results;

    // 생성자 : results 리스트를 초기화한다
    public Calculator() {
        this.results = new ArrayList<>();
    }

    //results 리스트를 반환하는 getter 메서드
    public List<Double> getResults() {
        return results;
    }

    //results 리스트를 외부에서 설정할 수 있는 setter 메서드
    public void setResults(List<Double> results) {
        this.results = results;
    }

    // 가장 먼저 저장된 데이터를 삭제하는 메서드
    public void removeResult() {
        double removeResult = results.get(0);
        results.remove(0);
        System.out.println("삭제된 값 : " + removeResult);
    }

    public double calculate(int first, char operator, int second) {
        //계산 결과를 저장하는 변수
        double result = 0;
        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                //두 번째 숫자가 0일 경우 반복적으로 입력 받음

                //정수를 double로 변환하여 소수점까지 받기
                result = (double)first / second;
                break;
            default:
                //연산자가 올바르지 않을 경우 경고 메세지 출력
                System.out.println("올바른 연산 기호를 입력하세요.");

        }
        //계산 결과를 results 리스트에 저장
        this.results.add(result);

        //계산 결과 반환
        return result; //
    }
}

