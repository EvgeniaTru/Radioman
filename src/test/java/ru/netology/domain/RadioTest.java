package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(9);

    @Test
    public void shouldCheckMinStationQuantity() {
        Radio radio = new Radio();
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
    public void shouldCheckSetStationQuantity() {
        radio.setOn(true);
        int expected = radio.getStationQuantity();
        assertEquals(expected, radio.getStationQuantity());
    }


    @Test
    public void shouldChangeNextStation() {
        radio.setOn(true);
        radio.setCurrentStation(7);
        int stationBeforeNext = radio.getCurrentStation();
        radio.changeNextStation();
        assertEquals(stationBeforeNext + 1, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevStation() {
        radio.setOn(true);
        radio.setCurrentStation(1);
        int stationBeforePrev = radio.getCurrentStation();
        radio.changePrevStation();
        assertEquals(stationBeforePrev - 1, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeNextAfterMaxStation() {
        radio.setOn(true);
        radio.setCurrentStation(8);
        int maxStationBeforeNext = radio.getStartStation();
        radio.changeNextStation();
        assertEquals(maxStationBeforeNext, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevBeforeMinStation() {
        radio.setOn(true);
        radio.setCurrentStation(0);
        int minStationAfterNext = radio.getMaxStation();
        radio.changePrevStation();
        assertEquals(minStationAfterNext, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setOn(true);
        radio.setCurrentVolume(51);
        int volumeBeforeIncreasing = radio.getCurrentVolume();
        radio.increaseVolume();
        assertEquals(volumeBeforeIncreasing + 1, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        radio.setOn(true);
        radio.setCurrentVolume(100);
        int volumeBeforeIncreasing = radio.getCurrentVolume();
        radio.increaseVolume();
        assertEquals(volumeBeforeIncreasing, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setOn(true);
        radio.setCurrentVolume(49);
        int volumeBeforeDecreasing = radio.getCurrentVolume();
        radio.decreaseVolume();
        assertEquals(volumeBeforeDecreasing - 1, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMinVolume() {
        radio.setOn(true);
        radio.setCurrentVolume(0);
        int volumeBeforeDecreasing = radio.getCurrentVolume();
        radio.decreaseVolume();
        assertEquals(volumeBeforeDecreasing, radio.getCurrentVolume());
    }

}

