package com.ll.level0.p120898;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("Hello => 5")
    void t1() {
        assertThat(new com.ll.level0.p120898.Solution().solution("Hello")).isEqualTo(10);

    }

    @Test
    @DisplayName("Hello!! => 14")
    void t2() {
        assertThat(new com.ll.level0.p120898.Solution().solution("Hello!!")).isEqualTo(14 );

    }
    @Test
    @DisplayName("하이 => 4")
    void t3() {
        assertThat(new com.ll.level0.p120898.Solution().solution("하이")).isEqualTo(4);

    }
}
