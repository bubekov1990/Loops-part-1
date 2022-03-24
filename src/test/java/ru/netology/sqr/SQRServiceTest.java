package ru.netology.sqr;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @Test
    void ShouldBorder() {
        SQRService service = new SQRService();
        int minimalimit = 200;
        int maxsimumlimit = 300;
        int expected = 3;

        int actual = service.borber(minimalimit, maxsimumlimit);

        assertEquals(expected, actual);

    }

    @Test
    void ShouldBorderWider() {
        SQRService service = new SQRService();
        int minimalimit = 100;
        int maxsimumlimit = 2000_00;
        int expected = 3;

        int actual = service.borber(minimalimit, maxsimumlimit);

        assertEquals(expected, actual);

    }

    @Test
    void ShouldBorderCounter() {
        SQRService service = new SQRService();
        int minimalimit = 200;
        int maxsimumlimit = 300;
        int expected = 4;

        int actual = service.borber(minimalimit, maxsimumlimit);

        assertEquals(expected, actual);

    }


}