package ru.netology.smarthome;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSetRadioStationNext() {
        Radio myRadio = new Radio();
        myRadio.setToRadioStation(5);
        myRadio.setToRadioStationNext();
        int expected = 6;
        int actual = myRadio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNextAbove9() {
        Radio myRadio = new Radio();
        myRadio.setToRadioStation(9);
        myRadio.setToRadioStationNext();
        int expected = 0;
        int actual = myRadio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationPrev() {
        Radio myRadio = new Radio();
        myRadio.setToRadioStation(5);
        myRadio.setToRadioStationPrev();
        int expected = 4;
        int actual = myRadio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationPrevLower0() {
        Radio myRadio = new Radio();
        myRadio.setToRadioStation(0);
        myRadio.setToRadioStationPrev();
        int expected = 9;
        int actual = myRadio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation() {
        Radio myRadio = new Radio();
        myRadio.setToRadioStation(5);
        int expected = 5;
        int actual = myRadio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationAbove() {
        Radio myRadio = new Radio();
        int currentRadioStation = myRadio.getRadioStation();
        myRadio.setToRadioStation(55);
        int expected = currentRadioStation;
        int actual = myRadio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationLower() {
        Radio myRadio = new Radio();
        int currentRadioStation = myRadio.getRadioStation();
        myRadio.setToRadioStation(-1);
        int expected = currentRadioStation;
        int actual = myRadio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioVolumeUp() {
        Radio myRadio = new Radio();
        myRadio.setToRadioVolume(5);
        myRadio.setToRadioVolumeUp();
        int expected = 6;
        int actual = myRadio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioVolumeDown() {
        Radio myRadio = new Radio();
        myRadio.setToRadioVolume(5);
        myRadio.setToRadioVolumeDown();
        int expected = 4;
        int actual = myRadio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioVolume() {
        Radio myRadio = new Radio();
        myRadio.setToRadioVolume(5);
        int expected = 5;
        int actual = myRadio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioVolumeAbove() {
        Radio myRadio = new Radio();
        int currentRadioVolume = myRadio.getRadioVolume();
        myRadio.setToRadioVolume(555);
        int expected = currentRadioVolume;
        int actual = myRadio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioVolumeLower() {
        Radio myRadio = new Radio();
        int currentRadioVolume = myRadio.getRadioVolume();
        myRadio.setToRadioVolume(-1);
        int expected = currentRadioVolume;
        int actual = myRadio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioVolumeUpAbove() {
        Radio myRadio = new Radio();
        myRadio.setToRadioVolume(100);
        myRadio.setToRadioVolumeUp();
        int expected = 100;
        int actual = myRadio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioVolumeDownLower() {
        Radio myRadio = new Radio();
        myRadio.setToRadioVolume(0);
        myRadio.setToRadioVolumeDown();
        int expected = 0;
        int actual = myRadio.getRadioVolume();
        Assertions.assertEquals(expected, actual);
    }

}