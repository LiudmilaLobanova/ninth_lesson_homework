package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation(){
        return currentStation;
    }

    public int getCurrentVolume(){
        return currentVolume;
    }

    public void setCurrentStation(int newStation) {
        if(newStation > 9 ) {
            currentStation = 0;
            return;
        }
        if(newStation < 0 ) {
            currentStation = 9;
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
        if(newVolume < 0 | newVolume > 10 ) {
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
