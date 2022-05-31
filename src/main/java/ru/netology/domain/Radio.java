package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int soundVolume;
    private int minStation = 0;
    private int maxStation = 10;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation -1;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;

    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume > maxVolume) {
            return;
        }
        if (soundVolume < minVolume) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void increaseSoundVolume() {
        if (soundVolume < maxVolume)
            soundVolume++;
    }

    public void decreaseSoundVolume() {
        if (soundVolume > minVolume)
            soundVolume--;
    }


}



