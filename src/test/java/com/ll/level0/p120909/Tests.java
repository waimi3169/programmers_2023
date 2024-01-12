package com.ll.level0.p120909;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("144 => 1")
    void t1() {
        assertThat(new com.ll.level0.p120909.Solution().solution(144) ).isEqualTo(1);

    }

    @Test
    @DisplayName("976 => 2")
    void t2() {
        assertThat(new com.ll.level0.p120909.Solution().solution( 976)).isEqualTo(2);

    }
    @Test
    @DisplayName("5 => 2")
    void t3() {
        assertThat(new com.ll.level0.p120909.Solution().solution(5)).isEqualTo(2);

    }
}