package com.ll.level0.p120830;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("10.3 => 124000")
    void t1() {
        assertThat(new com.ll.level0.p120830.Solution().solution(10, 3)).isEqualTo(124000);

    }

    @Test
    @DisplayName("64.6 => 768000")
    void t2() {
        assertThat(new com.ll.level0.p120830.Solution().solution(64, 6)).isEqualTo(768000 );

    }
    @Test
    @DisplayName("2.1 => 24000")
    void t3() {
        assertThat(new com.ll.level0.p120830.Solution().solution(2, 1)).isEqualTo(26000);

    }
}
