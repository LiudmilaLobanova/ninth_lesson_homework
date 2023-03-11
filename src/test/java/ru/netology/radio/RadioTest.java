package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetNumberOfStationsPositive(){
        Radio radio = new Radio(15);

        int expected = 14;
        int actual = radio.getMaxStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldNotSetNumberOfStationsNegative(){
        Radio radio = new Radio(-4);

        int expected = 9;
        int actual = radio.getMaxStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldNotSetNumberOfStationsNull(){
        Radio radio = new Radio(0);

        int expected = 9;
        int actual = radio.getMaxStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetNumberOfStationsDefault(){
        Radio radio = new Radio();

        int expected = 9;
        int actual = radio.getMaxStationNumber();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetCurrentStationIfNumberDefault() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldSetCurrentStationIfNumberDefaultBorder() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldNotSetStationNegativeIfNumberDefault() {
        Radio radio = new Radio();
        radio.setCurrentStation(-7);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldNotSetStationTooBigIfNumberDefault() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }



    @Test
    public void shouldSetStationCastomNumberOfStationsPositive() {
        Radio radio = new Radio(17);
        radio.setCurrentStation(13);

        int expected = 13;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldNotSetStationCastomNumberOfStationsBorder() {
        Radio radio = new Radio(17);
        radio.setCurrentStation(17);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldNotSetStationCastomNumberOfStationsNegative() {
        Radio radio = new Radio(17);
        radio.setCurrentStation(-7);

        int expected = 16;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldNotSetStationCastomNumberOfStationsTooBig() {
        Radio radio = new Radio(17);
        radio.setCurrentStation(20);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldIncreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.increaseCurrentStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldDecreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.decreaseCurrentStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldNotIncreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.increaseCurrentStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldNotDecreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.decreaseCurrentStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldIncreaseStationCastomNumberOfStations() {
        Radio radio = new Radio(17);
        radio.setCurrentStation(5);

        radio.increaseCurrentStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldDecreaseStationCastomNumberOfStations() {
        Radio radio = new Radio(17);
        radio.setCurrentStation(5);

        radio.decreaseCurrentStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldNotIncreaseStationCastomNumberOfStations() {
        Radio radio = new Radio(17);
        radio.setCurrentStation(16);

        radio.increaseCurrentStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldNotDecreaseStationCastomNumberOfStations() {
        Radio radio = new Radio(17);
        radio.setCurrentStation(0);

        radio.decreaseCurrentStation();

        int expected = 16;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.increaseVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.decreaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);

    }

}

