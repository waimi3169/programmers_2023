package com.ll.level0.p181938;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("2,91 => 364")
    void t1() {
        assertThat(new com.ll.level0.p181938.Solution().solution(2,91)).isEqualTo(364);

    }

    @Test
    @DisplayName("91,2 => 912")
    void t2() {
        assertThat(new com.ll.level0.p181938.Solution().solution(91,2)).isEqualTo(912);

    }
    @Test
    @DisplayName("4,10 => 410")
    void t3() {
        assertThat(new com.ll.level0.p181938.Solution().solution(4,10)).isEqualTo(410);

    }
}