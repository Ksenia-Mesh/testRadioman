package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// class RadioTest {

//     @Test
//     void nextChannel() {
//         Radio radio = new Radio();
//         radio.setCurrentRadioStation(8);
//         radio.nextCurrentRadioStation();
//         assertEquals(9, radio.getCurrentRadioStation());
//     }
    
//         @Test
//     void lastChannel() {
//         Radio radio = new Radio();
//         radio.setCurrentRadioStation(10);
//         radio.nextCurrentRadioStation();
//         assertEquals(1, radio.getCurrentRadioStation());
//     }

//     @Test
//     void prevChannel() {
//         Radio radio = new Radio();
//         radio.setCurrentRadioStation(5);
//         radio.prevCurrentRadioStation();
//         assertEquals(4, radio.getCurrentRadioStation());
//     }

//     @Test
//     void prevChannel2() {
//         Radio radio = new Radio();
//         radio.setCurrentRadioStation(-3);
//         radio.prevCurrentRadioStation();
//         assertEquals(9, radio.getCurrentRadioStation());
//     }

//     @Test
//     public void setChannel() {
//         Radio radio = new Radio();
//         radio.setCurrentRadioStation(3);
//         assertEquals(3, radio.getCurrentRadioStation());
//     }

//     @Test
//     public void previousChannelFromMin() {
//         Radio radio = new Radio();
//         radio.setCurrentRadioStation(0);
//         radio.prevCurrentRadioStation();
//         assertEquals(9, radio.getCurrentRadioStation());
//     }

//     @Test
//     public void nextChannelFromMax() {
//         Radio radio = new Radio();
//         radio.setCurrentRadioStation(9);
//         radio.nextCurrentRadioStation();
//         assertEquals(0, radio.getCurrentRadioStation());
//     }

//     @Test
//     void increaseVolume() {
//         Radio radio = new Radio();
//         radio.setSoundVolume(6);
//         radio.increaseVolume();
//         assertEquals(7, radio.getSoundVolume());
//     }

//     @Test
//     void decreaseVolume() {
//         Radio radio = new Radio();
//         radio.setSoundVolume(8);
//         radio.decreaseVolume();
//         assertEquals(7, radio.getSoundVolume());
//     }

//     @Test
//     public void increaseVolumeMaxVolume() {
//         Radio radio = new Radio();
//         radio.setSoundVolume(10);
//         radio.increaseVolume();
//         assertEquals(10, radio.getSoundVolume());
//     }

//     @Test
//     public void decreaseVolumeMinVolume() {
//         Radio radio = new Radio();
//         radio.setSoundVolume(0);
//         radio.decreaseVolume();
//         assertEquals(0, radio.getSoundVolume());
//     }

// //    @Test
// //    public void increaseVolumeFromAnyValue() {
// //        Radio radio = new Radio();
// //        radio.setSoundVolume(50);
// //        radio.increaseVolume();
// //        assertEquals(10, radio.getSoundVolume());
// //    }

// //     @Test
// //     public void decreaseVolume2() {
// //         Radio radio = new Radio();
// //         radio.setSoundVolume(-100);
// //         radio.decreaseVolume();
// //         assertEquals(0, radio.getSoundVolume());
// //     }

// //     @Test
// //     public void increaseVolume3() {
// //         Radio radio = new Radio();
// //         radio.setSoundVolume(-100);
// //         radio.increaseVolume();
// //         assertEquals(1, radio.getSoundVolume());
// //     }


// }



class RadioTest {

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.decreaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void nextChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(6);
        radio.increaseChannel();
        assertEquals(7, radio.getCurrentChannel());
    }

    @Test
    void nextChannel2() {
        Radio radio = new Radio();
        radio.setCurrentChannel(10);
        radio.increaseChannel();
        assertEquals(1, radio.getCurrentChannel());
    }


    @Test
    void previousChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(6);
        radio.decreaseChannel();
        assertEquals(5, radio.getCurrentChannel());
    }

    @Test
    void previousChannel2() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);
        radio.decreaseChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void increaseVolumeFromMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setDesiredChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        assertEquals(5, radio.getCurrentChannel());
    }

    @Test
    public void previousChannelFromMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.decreaseChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void nextChannelFromMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.increaseChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void increaseVolumeFromAnyValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromAnyValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromAnyMinus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-100);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumeFromAnyMinus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-100);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }
}

