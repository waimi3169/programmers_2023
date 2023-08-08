package com.ll.level0.p120847;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);
        int max1 = numbers[numbers.length-1];
        int max2 = numbers[numbers.length-2];

        answer = max1*max2;

        return answer;
    }
}

class Solution2 {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;

        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] > max) {
                    max = numbers[i] * numbers[j];
                }
            }
        }
        answer = max;

        return answer;
    }
}
