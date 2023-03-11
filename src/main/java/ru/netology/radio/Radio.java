package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int numberOfStations = 10;

    public Radio() {

    }

    public Radio(int numberOfStations){
        if(numberOfStations > 0) {
            this.numberOfStations = numberOfStations;
        } else {
            return;
        }

    }

    public int getCurrentStation(){
        return currentStation;
    }

    public int getCurrentVolume(){
        return currentVolume;
    }

    public int getMaxStationNumber(){
        return numberOfStations - 1;
    }

    public void setCurrentStation(int newStation) {
        if(newStation > getMaxStationNumber() ) {
            currentStation = 0;
            return;
        }
        if(newStation < 0 ) {
            currentStation = getMaxStationNumber();
            return;
        } else {
            currentStation = newStation;
        }
    }

    public void increaseCurrentStation(){
        int target = currentStation + 1;
        setCurrentStation(target);
    }

    public void decreaseCurrentStation(){
        int target = currentStation - 1;
        setCurrentStation(target);
    }

    public void setCurrentVolume(int newVolume) {
        if(newVolume < 0 | newVolume > 100 ) {
            return;
        } else {
            currentVolume = newVolume;
        }
    }

    public void increaseVolume() {
        int target = currentVolume + 1;
        setCurrentVolume(target);
    }
    public void decreaseVolume(){
        int target = currentVolume - 1;
        setCurrentVolume(target);
    }
}

