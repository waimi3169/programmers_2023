package com.ll.level0.p181939;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("9,91 => 991")
    void t1() {
        assertThat(new com.ll.level0.p181939.Solution().solution(9,91)).isEqualTo(991);

    }

    @Test
    @DisplayName("89,8 => 898")
    void t2() {
        assertThat(new com.ll.level0.p181939.Solution().solution(89,8)).isEqualTo(898);

    }
    @Test
    @DisplayName("37,8 => 837")
    void t3() {
        assertThat(new com.ll.level0.p181939.Solution().solution(37,8)).isEqualTo(837);

    }
}