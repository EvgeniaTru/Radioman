package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int startStation;
    private int stationQuantity = 10;
    private int maxStation = 9;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private boolean on;

    public Radio() {
    }

    public Radio(int stationQuantity) {
        this.stationQuantity = stationQuantity;
        this.maxStation = stationQuantity - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < startStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getStartStation() {
        return startStation;
    }

    public void setStartStation(int startStation) {
        this.startStation = startStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
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

    public int getStationQuantity() {
        return stationQuantity;
    }

    public void setStationQuantity(int stationQuantity) {
        if (stationQuantity > startStation) {
            this.stationQuantity = stationQuantity;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
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

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

}
