package com.ll.level0.p181933;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("10.3 => 13")
    void t1() {
        assertThat(new com.ll.level0.p181933.Solution().solution(10, 3, true)).isEqualTo(13);

    }

    @Test
    @DisplayName("64.6 => 58")
    void t2() {
        assertThat(new com.ll.level0.p181933.Solution().solution(64, 6, false)).isEqualTo(58);

    }
    @Test
    @DisplayName("2.1 => 3")
    void t3() {
        assertThat(new com.ll.level0.p181933.Solution().solution(2, 1, true)).isEqualTo(3);

    }
}
