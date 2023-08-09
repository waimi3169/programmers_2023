package com.ll.level0.p181936;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("10.3 => 13")
    void t1() {
        assertThat(new com.ll.level0.p181936.Solution().solution(60, 2, 3)).isEqualTo(1);

    }

    @Test
    @DisplayName("64.6 => 58")
    void t2() {
        assertThat(new com.ll.level0.p181936.Solution().solution(55, 2, 3)).isEqualTo(0);

    }
    @Test
    @DisplayName("2.1 => 3")
    void t3() {
        assertThat(new com.ll.level0.p181936.Solution().solution(32, 4, 8)).isEqualTo(1);

    }
}
