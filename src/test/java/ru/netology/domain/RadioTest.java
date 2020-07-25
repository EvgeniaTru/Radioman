package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldCheckMinStationQuantity() {
        radio.setOn(true);
        radio.setStationQuantity(0);
        assertEquals(10, radio.getStationQuantity());
    }

    @Test
    public void shouldCheckMaxCurrentStation() {
        radio.setOn(true);
        radio.setStationQuantity(9);
        int maxCurrentStation = radio.getStationQuantity() - 1;
        assertEquals(maxCurrentStation, radio.getStationQuantity()-1);
    }

    @Test
    public void shouldChangeNextStation() {
        radio.setOn(true);
        radio.setStationQuantity(9);
        radio.setCurrentStation(7);
        int stationBeforeNext = radio.getCurrentStation();
        radio.changeNextStation();
        assertEquals(stationBeforeNext + 1, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevStation() {
        radio.setOn(true);
        radio.setStationQuantity(2);
        radio.setCurrentStation(1);
        int stationBeforePrev = radio.getCurrentStation();
        radio.changePrevStation();
        assertEquals(stationBeforePrev - 1, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeNextAfterMaxStation() {
        radio.setOn(true);
        radio.setStationQuantity(15);
        radio.setCurrentStation(14);
        int maxStationBeforeNext = 0;
        radio.changeNextStation();
        assertEquals(maxStationBeforeNext, radio.getCurrentStation());
    }

    @Test
    public void shouldChangePrevBeforeMinStation() {
        radio.setOn(true);
        radio.setCurrentStation(0);
        int minStationAfterNext = radio.getStationQuantity()-1;
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

