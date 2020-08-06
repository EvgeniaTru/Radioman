package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentStation;
    private int startStation = 0;
    private int stationQuantity = 10;
    private int maxStation = stationQuantity - 1;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private boolean on;


    public void setCurrentStation(int currentStation) {
        if (currentStation < startStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void changeNextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = startStation;
        }
    }

    public void changePrevStation() {
        if (currentStation > startStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void setStationQuantity(int stationQuantity) {
        if (stationQuantity > startStation) {
            this.stationQuantity = stationQuantity;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}
