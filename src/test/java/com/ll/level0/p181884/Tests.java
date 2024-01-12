package com.ll.level0.p181884;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("[34, 5, 71, 29, 100, 34] , 123=> 139")
    void t1() {
        assertThat(new com.ll.level0.p181884.Solution().solution(new int[]{34, 5, 71, 29, 100, 34}, 123) ).isEqualTo(139);

    }

    @Test
    @DisplayName("[58, 44, 27, 10, 100],139 => 239")
    void t2() {
        assertThat(new com.ll.level0.p181884.Solution().solution( new int[]{58, 44, 27, 10, 100},139)).isEqualTo(239);

    }
    @Test
    @DisplayName("[1,3,5],3 => 4")
    void t3() {
        assertThat(new com.ll.level0.p181884.Solution().solution(new int[]{1,3,5},3)).isEqualTo(4);

    }
}