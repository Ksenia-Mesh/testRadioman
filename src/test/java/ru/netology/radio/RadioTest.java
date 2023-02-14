package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void nextChannel() {
        radio.setCurrentRadioStation(8);
        radio.nextCurrentRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }


}
