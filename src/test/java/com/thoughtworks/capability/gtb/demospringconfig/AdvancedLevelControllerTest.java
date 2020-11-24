package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("advanced")
public class AdvancedLevelControllerTest {
    @Autowired
    LevelController levelController;
    @Test
    void should_return_advanced_when_level_number_not_less_than_1(){
        assertEquals("advanced",levelController.getLevel());
    }
}
