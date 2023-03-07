package com.ll.level0.p120814;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%7==0) {
            answer = n/7;
        } else {
            answer = (n/7)+1;
        }
        return answer;
    }
}
