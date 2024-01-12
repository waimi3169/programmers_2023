package com.ll.level0.p181928;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("[3, 4, 5, 2, 1] => 393")
    void t1() {
        assertThat(new com.ll.level0.p181928.Solution().solution(new int[]{3,4,5,2,1})).isEqualTo(393);

    }

    @Test
    @DisplayName("[5, 7, 8, 3] => 581")
    void t2() {
        assertThat(new com.ll.level0.p181928.Solution().solution(new int[]{5,7,8,3})).isEqualTo(581);

    }
    @Test
    @DisplayName("[1,2,3,4] => 37")
    void t3() {
        assertThat(new com.ll.level0.p181928.Solution().solution(new int[]{1,2,3,4})).isEqualTo(37);

    }
}