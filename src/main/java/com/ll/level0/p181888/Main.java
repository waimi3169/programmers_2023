package com.ll.level0.p181888;

public class Main {
    public static void main(String[] args) {

    }
}

// 정수 리스트 num_list와 정수 n이 주어질 때,
// num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        if(num_list.length % n == 0){
            answer = new int[num_list.length/n];
        } else {
            answer = new int[num_list.length/n+1];
        }
        int index = 0;
        for (int i = 0; i < num_list.length; i += n) {
            answer[index++] = num_list[i];
        }
        return answer;
    }
}
