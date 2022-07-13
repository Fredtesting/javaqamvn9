package ru.netology.javaqa.javaqamvn.services;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;
    private int maxNumberStation = 9;
    private int minNumberStation;
    private int maxVolume = 100;
    private int minVolume;

    public Radio() {
    }

    public Radio(int newMaxNumberStation) {
        maxNumberStation = newMaxNumberStation -1;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minNumberStation) {
            return;
        }
        if (newCurrentRadioStation > maxNumberStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxNumberStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minNumberStation;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > minNumberStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxNumberStation;
        }
    }



    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
