package com.ntokozos.hundred_doors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class TestHundredDoors {

    @Test
    public void construct() {
        // Arrange
        // Act
        HundredDoors sut = new HundredDoors();
        // Assert
        assertThat(sut).isNotNull();
        assertDoesNotThrow(() -> sut);
    }
}
