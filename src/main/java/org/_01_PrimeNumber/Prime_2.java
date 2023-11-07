package org._01_PrimeNumber;

import java.util.Scanner;

public class Prime_2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        is_prime(in.nextInt());

        // 0~N 까지 수 중 소수를 구하는 반복문
        for (int i=0; i<=N; i++) {
            make_prime(i);
        }
    }

    // 소수 판별 메소드
    // 소수 판별 알고리즘
    public static void is_prime(int number){

        // 0과 1은 소수가 아니다
        if (number < 2){
            System.out.println("소수가 아닙니다");
            return;
        }

        // 2는 소수다
        if (number == 2){
            System.out.println("소수입니다");
            return;
        }

        // 제곱근 함수 : Math.sqrt()
        for (int i=2; i<=Math.sqrt(number); i++){

            // 소수가 아닐경우
            if (number % i == 0){
                System.out.println("소수가 아닙니다");
                return;
            }
        }
        // 위 반복문에서 약수를 갖고 있지 않는 경우 소수다.
        System.out.println("소수입니다");
        return;
    }

    // 소수 생성 메소드
    // N이하의 모든 소수 구하는 알고리즘
    public static void make_prime(int number){

        // 0과 1은 소수가 아니므로 종료
        if (number < 2){
            return;
        }

        // 2는 소수다
        if (number == 2){
            System.out.println(number);
            return;
        }

        // 제곱근 함수 : Math.sqrt()
        for (int i=2; i<=Math.sqrt(number); i++){

            // 소수가 아닐경우 종료
            if (number%i==0){
                return;
            }
        }
        // 위 반복문에서 약수를 갖고 이지 않는 경우 소수다.
        System.out.println(number);
        return;
    }
}
