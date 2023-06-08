package com.ll.level0.p120836;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("6 => 4")
    void t1() {
        assertThat(new com.ll.level0.p120836.Solution().solution(6)).isEqualTo(4);

    }

    @Test
    @DisplayName("1 => 1")
    void t2() {
        assertThat(new com.ll.level0.p120836.Solution().solution(1)).isEqualTo(1);

    }
    @Test
    @DisplayName("10 => 4")
    void t3() {
        assertThat(new com.ll.level0.p120836.Solution().solution(10)).isEqualTo(4);

    }
}
