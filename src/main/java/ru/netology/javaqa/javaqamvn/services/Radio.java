package ru.netology.javaqa.javaqamvn.services;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxNumberRadioStation = 9;
    private int minNumberRadioStation;
    private int maxVolume = 100;
    private int minVolume;

    public Radio() {
    }

    public Radio(int newMaxNumberRadioStation) {
        if (newMaxNumberRadioStation == maxNumberRadioStation) {
            newMaxNumberRadioStation = maxNumberRadioStation - 1;
        }
        maxNumberRadioStation = newMaxNumberRadioStation;
    }


        public int getCurrentRadioStation() {
            return currentRadioStation;
        }

        public int getMaxNumberRadioStation () {
            return maxNumberRadioStation;
        }

        public void setCurrentRadioStation(int newCurrentRadioStation) {
            if (newCurrentRadioStation < minNumberRadioStation) {
                return;
            }
            if (newCurrentRadioStation > maxNumberRadioStation) {
                return;
            }
            currentRadioStation = newCurrentRadioStation;
        }

        public void nextRadioStation() {
            if (currentRadioStation < maxNumberRadioStation) {
                currentRadioStation = currentRadioStation + 1;
            }

            if (currentRadioStation >= maxNumberRadioStation) {
                currentRadioStation = minNumberRadioStation;
            }
        }

        public void prevRadioStation() {
            if (currentRadioStation > minNumberRadioStation) {
                currentRadioStation = currentRadioStation - 1;
            }

            if (currentRadioStation <= minNumberRadioStation) {
                currentRadioStation = maxNumberRadioStation;
            }
        }


        public int getCurrentVolume() {
            return currentVolume;
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

        public void increaseVolume() {
            if (currentVolume < maxVolume) {
                currentVolume = currentVolume + 1;
            }

            if (currentVolume >= maxVolume) {
                currentVolume = maxVolume;
            }
        }

        public void decreaseVolume () {
            if (currentVolume > minVolume) {
                currentVolume = currentVolume - 1;
            }

            if (currentVolume <= minVolume) {
                currentVolume = minVolume;
            }
        }
    }
