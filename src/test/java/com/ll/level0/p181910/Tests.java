package com.ll.level0.p181910;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("He110W0r1d => W0r1d")
    void t1() {
        assertThat(new com.ll.level0.p181910.Solution().solution("He110W0r1d", 5)).isEqualTo("W0r1d");

    }

    @Test
    @DisplayName("ProgrammerS123 => grammerS123")
    void t2() {
        assertThat(new com.ll.level0.p181910.Solution().solution("ProgrammerS123", 11)).isEqualTo("grammerS123");

    }
    @Test
    @DisplayName("2.1 => 3")
    void t3() {
        assertThat(new com.ll.level0.p181910.Solution().solution("HelloWorld", 4)).isEqualTo("orld");

    }
}
