package ru.netology.domain;

import lombok.Data;

@Data
public class Radio {
    private int currentStation;
    private int stationQuantity = 10;
    private int currentVolume;
    private boolean on;


    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > stationQuantity - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void changeNextStation() {
        if (currentStation < stationQuantity - 1) {
            this.currentStation = currentStation + 1;
        } else {
            this.currentStation = 0;
        }
    }

    public void changePrevStation() {
        if (currentStation > 0) {
            this.currentStation = currentStation - 1;
        } else {
            this.currentStation = stationQuantity - 1;
        }
    }

    public void setStationQuantity(int stationQuantity) {
        if (stationQuantity > 0) {
            this.stationQuantity = stationQuantity;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
    }
}
