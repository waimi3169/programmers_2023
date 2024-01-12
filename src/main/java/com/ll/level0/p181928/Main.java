package com.ll.level0.p181928;

// 정수가 담긴 리스트 num_list가 주어집니다.
// num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 1) {
                a.append(num_list[i]);
            } else if (num_list[i] % 2 == 0) {
                b.append(num_list[i]);
            }
        }
        int aInt = Integer.parseInt(a.toString());
        int bInt = Integer.parseInt(b.toString());
        answer = aInt + bInt;
        return answer;
    }
}