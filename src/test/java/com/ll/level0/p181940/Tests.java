package com.ll.level0.p181940;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("string , 3=> stringstringstring")
    void t1() {
        assertThat(new com.ll.level0.p181940.Solution().solution("string", 3) ).isEqualTo("stringstringstring");

    }

    @Test
    @DisplayName("love,10 => lovelovelovelovelovelovelovelovelovelove")
    void t2() {
        assertThat(new com.ll.level0.p181940.Solution().solution( "love",10)).isEqualTo("lovelovelovelovelovelovelovelovelovelove");

    }
    @Test
    @DisplayName("ch,3 => chchch")
    void t3() {
        assertThat(new com.ll.level0.p181940.Solution().solution("ch",3)).isEqualTo("chchch");

    }
}