package com.ll.level0.p181920;

// 정수 start_num와 end_num가 주어질 때,
// start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        int index = 0;
        for(int i = start_num; i <= end_num; i++) {
            answer[index] = i;
            index ++;
        }
        return answer;
    }
}