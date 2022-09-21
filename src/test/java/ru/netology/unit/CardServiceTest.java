package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardServiceTest {

    @Test
    void changeCount() {
        CardService service = new CardService();

        assertThrows(UnsupportedOperationException.class, () -> service.changeCount(1,1));
    }
}