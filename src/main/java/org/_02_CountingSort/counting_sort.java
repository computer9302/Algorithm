package org._02_CountingSort;

public class counting_sort {
    public static void main(String[] args) {

        int[] arr = new int[101]; // 수의 범위 : 0 ~ 100

        for (int i = 0; i < 50; i++){ // 수열의 크기 : 50
            arr[(int)(Math.random() * 101)]++; // 0 ~ 100
        }

        for (int i = 0; i < arr.length; i++){

            while (arr[i]-- > 0){ // arr 값이 0보다 클 경우
                System.out.print(i + " ");
            }
        }

    }
}