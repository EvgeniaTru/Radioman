package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldCheckMinStationQuantity() {
        radio.setStationQuantity(0);
        assertEquals(10, radio.getStationQuantity());
    }

    @Test
    public void shouldSetStationQuantity() {
        radio.setStationQuantity(15);
        assertEquals(15, radio.getStationQuantity());
    }

    @Test
    public void shouldSetNonValidCurrentStation() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNotExistedCurrentStation() {
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStation() {
        radio.setCurrentStation(4);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNonValidCurrentVolume() {
        radio.setOn(true);
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetNotExistedCurrentVolume() {
        radio.setOn(true);
        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume() {
        radio.setOn(true);
        radio.setCurrentVolume(34);
        assertEquals(34, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeNextStation() {
        Radio radio = new Radio(7, 0, 9, 8, 100, 0, 49, true);
        int stationNext = radio.getCurrentStation() + 1;
        radio.changeNextStation();
        assertEquals(stationNext, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevStation() {
        Radio radio = new Radio(1, 0, 2, 1, 100, 0, 49, true);
        int stationPrev = radio.getCurrentStation() - 1;
        radio.changePrevStation();
        assertEquals(stationPrev, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeNextAfterMaxStation() {
        Radio radio = new Radio(14, 0, 15, 14, 100, 0, 49, true);
        int maxStationNext = 0;
        radio.changeNextStation();
        assertEquals(maxStationNext, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevBeforeMinStation() {
        Radio radio = new Radio(0, 0, 9, 8, 100, 0, 49, true);
        int minStationNext = radio.getMaxStation();
        radio.changePrevStation();
        assertEquals(minStationNext, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio(7, 0, 9, 8, 100, 0, 51, true);
        int volumeIncreasing = radio.getCurrentVolume() + 1;
        radio.increaseVolume();
        assertEquals(volumeIncreasing, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        Radio radio = new Radio(7, 0, 9, 8, 100, 0, 100, true);
        int volumeBeforeIncreasing = radio.getCurrentVolume();
        radio.increaseVolume();
        assertEquals(volumeBeforeIncreasing, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio(7, 0, 9, 8, 100, 0, 49, true);
        int volumeDecreasing = radio.getCurrentVolume() - 1;
        radio.decreaseVolume();
        assertEquals(volumeDecreasing, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMinVolume() {
        Radio radio = new Radio(7, 0, 9, 8, 100, 0, 0, true);
        int volumeBeforeDecreasing = radio.getCurrentVolume();
        radio.decreaseVolume();
        assertEquals(volumeBeforeDecreasing, radio.getCurrentVolume());
    }
}

