package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private boolean on;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void changeNextStation() {
        if (currentStation < 9) {
            this.currentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            this.currentStation = 0;
        }
        return;
    }

    public void changePrevStation() {
        if (currentStation > 0) {
            this.currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            this.currentStation = 9;
        }
        return;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume (int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
        return;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
        return;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

}
