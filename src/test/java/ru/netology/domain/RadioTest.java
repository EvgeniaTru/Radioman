package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldCheckCorrectCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeNextStation() {
        Radio radio = new Radio();
        radio.setOn(true);
        radio.setCurrentStation(1);
        int stationBeforeNext = radio.getCurrentStation();
        radio.changeNextStation();
        assertEquals(stationBeforeNext + 1, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevStation() {
        Radio radio = new Radio();
        radio.setOn(true);
        radio.setCurrentStation(9);
        int stationBeforePrev = radio.getCurrentStation();
        radio.changePrevStation();
        assertEquals(stationBeforePrev - 1, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeNextAfterMaxStation() {
        Radio radio = new Radio();
        radio.setOn(true);
        radio.setCurrentStation(9);
        int maxStationBeforeNext = 0;
        radio.changeNextStation();
        assertEquals(maxStationBeforeNext, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevBeforeMinStation() {
        Radio radio = new Radio();
        radio.setOn(true);
        radio.setCurrentStation(0);
        int minStationBeforePrev = 9;
        radio.changePrevStation();
        assertEquals(minStationBeforePrev, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setOn(true);
        radio.setCurrentVolume(8);
        int volumeBeforeIncreasing = radio.getCurrentVolume();
        radio.increaseVolume();
        assertEquals(volumeBeforeIncreasing + 1, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setOn(true);
        radio.setCurrentVolume(10);
        int volumeBeforeIncreasing = radio.getCurrentVolume();
        radio.increaseVolume();
        assertEquals(volumeBeforeIncreasing, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setOn(true);
        radio.setCurrentVolume(7);
        int volumeBeforeDecreasing = radio.getCurrentVolume();
        radio.decreaseVolume();
        assertEquals(volumeBeforeDecreasing - 1, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMinVolume() {
        Radio radio = new Radio();
        radio.setOn(true);
        radio.setCurrentVolume(0);
        int volumeBeforeDecreasing = radio.getCurrentVolume();
        radio.decreaseVolume();
        assertEquals(volumeBeforeDecreasing, radio.getCurrentVolume());
    }

}

