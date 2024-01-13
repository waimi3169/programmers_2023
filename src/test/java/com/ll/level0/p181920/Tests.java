package com.ll.level0.p181920;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("3,10 => [3,4,5,6,7,8,9,10")
    void t1() {
        assertThat(new com.ll.level0.p181920.Solution().solution(3,10)).isEqualTo(new int[]{3,4,5,6,7,8,9,10});

    }

    @Test
    @DisplayName("1,5 => [1,2,3,4,5]")
    void t2() {
        assertThat(new com.ll.level0.p181920.Solution().solution(1,5)).isEqualTo(new int[]{1,2,3,4,5});

    }

}