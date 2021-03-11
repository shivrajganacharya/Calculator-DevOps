package com.example.calculator;

import com.example.calculator.controller.ComputeController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorApplicationTests {

    @Test
    void testSqroot() {
        ComputeController controller = new ComputeController();
        double expected = 10.0;
        double actual = controller.getRoot(100);
        assertEquals(expected, actual);
    }

}
