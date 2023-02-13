package ru.netology.radio;
public class Radio {
    private int currentRadioStation;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int soundVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation( int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextCurrentRadioStation() {
        if (currentRadioStation >= maxRadioStation) {
            setCurrentRadioStation(minRadioStation);
        }
        else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prevCurrentRadioStation () {
        if (currentRadioStation <= minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
        }
        else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume (int soundVolume) {
        if (soundVolume > maxVolume) {
            return;
        }
        if (soundVolume < minVolume) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < maxVolume) {
            soundVolume = soundVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > minVolume) {
            soundVolume = soundVolume - 1;
        }
    }
}
