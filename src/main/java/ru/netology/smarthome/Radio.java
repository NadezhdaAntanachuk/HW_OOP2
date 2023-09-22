package ru.netology.smarthome;

public class Radio {
    public int radioStation;
    public int radioVolume;

    public int getRadioStation() {
        return radioStation;
    }

    public int getRadioVolume() {
        return radioVolume;
    }

    public void setToRadioVolume(int likeRadioVolume) {
        if (likeRadioVolume <0 || likeRadioVolume > 100) {
            return;
        } else {
            radioVolume = likeRadioVolume;
        }
    }

    public void setToRadioStationNext() {
        if (radioStation < 9) {
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
            radioStation = 9;
            return;
        }
    }

    public void setToRadioStation(int stationNumber) {
        if (stationNumber > 9 || stationNumber < 0) {
            return;
        } else {
            radioStation = stationNumber;
            return;
        }
    }

    public void setToRadioVolumeUp() {
        if (radioVolume < 100) {
            radioStation++;
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
