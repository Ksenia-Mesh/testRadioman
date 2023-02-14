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

    @Test
    void lastChannel() {
        radio.setCurrentRadioStation(10);
        radio.nextCurrentRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    void prevChannel() {
        radio.setCurrentRadioStation(5);
        radio.prevCurrentRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    void prevChannel2() {
        radio.setCurrentRadioStation(-1);
        radio.prevCurrentRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void setChannel() {
        radio.setCurrentRadioStation(3);
        assertEquals(3, radio.getCurrentRadioStation());
    }

    @Test
    public void previousChannelFromMin() {
        radio.setSoundVolume(0);
        radio.prevCurrentRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void nextChannelFromMax() {
        radio.setCurrentRadioStation(9);
        radio.nextCurrentRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void increaseVolume() {
        radio.setSoundVolume(6);
        radio.increaseVolume();
        assertEquals(7, radio.getSoundVolume());
    }

    @Test
    void decreaseVolume() {
        radio.setSoundVolume(8);
        radio.decreaseVolume();
        assertEquals(7, radio.getSoundVolume());
    }

    @Test
    public void increaseVolumeMaxVolume() {
        radio.setSoundVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getSoundVolume());
    }

    @Test
    public void decreaseVolumeMinVolume() {
        radio.setSoundVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getSoundVolume());
    }

//    @Test
//    public void increaseVolumeFromAnyValue() {
////        Radio radio = new Radio();
//        radio.setSoundVolume(100);
//        radio.increaseVolume();
//        assertEquals(10, radio.getSoundVolume());
//    }

    @Test
    public void decreaseVolume2() {
        radio.setSoundVolume(-100);
        radio.decreaseVolume();
        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    public void increaseVolume3() {
        radio.setSoundVolume(-100);
        radio.increaseVolume();
        assertEquals(1, radio.getSoundVolume());
    }
}