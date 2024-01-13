package com.ll.level0.p181935;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("7 => 16")
    void t1() {
        assertThat(new com.ll.level0.p181935.Solution().solution(7)).isEqualTo(16);

    }

    @Test
    @DisplayName("10 => 220")
    void t2() {
        assertThat(new com.ll.level0.p181935.Solution().solution(10)).isEqualTo(220);

    }
    @Test
    @DisplayName("5 => 9")
    void t3() {
        assertThat(new com.ll.level0.p181935.Solution().solution(5)).isEqualTo(9);

    }
}