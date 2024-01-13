package com.ll.level0.p181937;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("98,2 => 1")
    void t1() {
        assertThat(new com.ll.level0.p181937.Solution().solution(98,2)).isEqualTo(1);

    }

    @Test
    @DisplayName("34,3 => 0")
    void t2() {
        assertThat(new com.ll.level0.p181937.Solution().solution(34,3)).isEqualTo(0);

    }
    @Test
    @DisplayName("242,4 => 0")
    void t3() {
        assertThat(new com.ll.level0.p181937.Solution().solution(242,4)).isEqualTo(0);

    }
}