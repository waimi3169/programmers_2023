package com.ll.level0.p120813;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        int temp = 1;
        for(int i = 0; i<answer.length; i++) {
            answer[i] = temp;
            temp+=2;
        }
        return answer;
    }
}
