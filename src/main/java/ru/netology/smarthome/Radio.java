package ru.netology.smarthome;

public class Radio {
    private int radioStation;
    private int radioVolume;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }

    public int getRadioStation() {
        return radioStation;
    }

    public int getRadioVolume() {
        return radioVolume;
    }

    public void setToRadioVolume(int likeRadioVolume) {
        if (likeRadioVolume < 0 || likeRadioVolume > 100) {
            return;
        } else {
            radioVolume = likeRadioVolume;
        }
    }

    public void setToRadioStationNext() {
        if (radioStation < maxStation) {
            radioStation++;
            return;
        } else {
            radioStation = 0;
            return;
        }
    }

    public void setToRadioStationPrev() {
        if (radioStation > 0) {
            radioStation--;
            return;
        } else {
            radioStation = maxStation;
            return;
        }
    }

    public void setToRadioStation(int stationNumber) {
        if (stationNumber > maxStation || stationNumber < 0) {
            return;
        } else {
            radioStation = stationNumber;
            return;
        }
    }

    public void setToRadioVolumeUp() {
        if (radioVolume < 100) {
            radioVolume++;
            return;
        } else {
            return;
        }
    }

    public void setToRadioVolumeDown() {
        if (radioVolume > 0) {
            radioVolume--;
            return;
        } else {
            return;
        }
    }


}
