package com.ll.level0.p120847;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("{1, 2, 3, 4} => 12")
    void t1() {
        assertThat(new com.ll.level0.p120847.Solution().solution(new int[]{1, 2, 3, 4})).isEqualTo(12);

    }

    @Test
    @DisplayName("{1, 5, 9, 4, 6} => 54")
    void t2() {
        assertThat(new com.ll.level0.p120847.Solution().solution(new int[]{1, 5, 9, 4, 6})).isEqualTo(54);

    }
    @Test
    @DisplayName("{3, 10, 7, 9} => 90")
    void t3() {
        assertThat(new com.ll.level0.p120847.Solution().solution(new int[]{3, 10, 7, 9})).isEqualTo(90);

    }
}
