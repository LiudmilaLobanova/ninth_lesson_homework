package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldNotSetStationNegative() {
        Radio radio = new Radio();
        radio.setCurrentStation(-7);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldNotSetStationTooBig() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

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
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
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
