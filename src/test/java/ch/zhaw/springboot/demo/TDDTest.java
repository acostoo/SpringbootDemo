package ch.zhaw.springboot.demo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TDDTest1 {

    @Test
    public void numberConverter1() {
        TDD numberConverter = new TDD();
        
        assertThat("X").isEqualTo(numberConverter.convert(10));
                
    }

}