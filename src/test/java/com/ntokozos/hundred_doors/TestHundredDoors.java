package com.ntokozos.hundred_doors;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class TestHundredDoors {

    @Test
    public void construct() {
        assertDoesNotThrow(() -> new HundredDoors());
    }
}
