package com.ll.level0.p120849;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("Hello => Hll")
    void t1() {
        assertThat(new com.ll.level0.p120849.Solution().solution("Hello")).isEqualTo("Hll");

    }

    @Test
    @DisplayName("Hello!! => 14")
    void t2() {
        assertThat(new com.ll.level0.p120849.Solution().solution("Hello!!")).isEqualTo("Hll!!");

    }
    @Test
    @DisplayName("하이 => 하이")
    void t3() {
        assertThat(new com.ll.level0.p120849.Solution().solution("하이")).isEqualTo("하이");

    }
}
