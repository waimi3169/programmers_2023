package com.ll.level0.p181926;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("98,2 => 1")
    void t1() {
        assertThat(new com.ll.level0.p181926.Solution().solution(0, "wsdawsdassw")).isEqualTo(-1);

    }

    @Test
    @DisplayName("34,3 => 0")
    void t2() {
        assertThat(new com.ll.level0.p181926.Solution().solution(10, "wasd")).isEqualTo(10);

    }
}