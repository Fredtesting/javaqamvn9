package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioStationTest {


    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRadioStationAboveZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.nextRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNextStationAboveNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.prevRadioStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveTen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeAboveZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
