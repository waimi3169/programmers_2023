package com.ll.level0.p181845;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("123 => 123")
    void t1() {
        assertThat(new com.ll.level0.p181845.Solution().solution(123)).isEqualTo("123");

    }

    @Test
    @DisplayName("2573 => 2573")
    void t2() {
        assertThat(new com.ll.level0.p181845.Solution().solution(2573)).isEqualTo("2573");

    }
    @Test
    @DisplayName("15 => 15")
    void t3() {
        assertThat(new com.ll.level0.p181845.Solution().solution(15)).isEqualTo("15");

    }
}