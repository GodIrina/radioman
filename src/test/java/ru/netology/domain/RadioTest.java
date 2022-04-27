package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void setCurrentStation() {
        Radio cond = new Radio();
        int expected = 9;
        cond.setCurrentStation(expected);

        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldUseConstructor() {
        Radio radio = new Radio(5, 16, 0, 10, 0, 100);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldUseConstructor2() {
        Radio radio = new Radio(7, 87);
        assertEquals(10, radio.getMaxStation());
    }
    @Test
    public void shouldUseConstructor3() {
        Radio radio = new Radio(7, 87);
        assertEquals(0, radio.getMinStation());
    }


    @Test
    public void MinStation() {
        Radio cond = new Radio();
        int expected = 0;
        int actual = cond.getMinStation();
        assertEquals(expected, actual);

    }

    @Test
    public void MaxStation() {
        Radio cond = new Radio();
        int expected = 10;
        int actual = cond.getMaxStation();
        assertEquals(expected, actual);
    }

    @Test
    public void MinVolume() {
        Radio cond = new Radio();
        int expected = 0;
        int actual = cond.getMinVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void MaxVolume() {
        Radio cond = new Radio();
        int expected = 100;
        int actual = cond.getMaxVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void incorrectMinValueSetCurrentStation() {
        Radio cond = new Radio();
        int expected = cond.getCurrentStation();

        cond.setCurrentStation(-1);

        assertEquals(expected, cond.getCurrentStation());
    }

    @Test
    public void incorrectMaxValueSetCurrentStation() {
        Radio cond = new Radio();
        int expected = cond.getCurrentStation();

        cond.setCurrentStation(105);

        assertEquals(expected, cond.getCurrentStation());
    }

    @Test
    public void setCurrentStationMin() {
        Radio cond = new Radio();
        int expected = 0;
        cond.setCurrentStation(expected);

        int actual = cond.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(10);
        cond.nextStation();
        int expected = 0;
        assertEquals(expected, cond.getCurrentStation());


    }

    @Test
    public void nextStationNext() {
        Radio cond = new Radio();
        cond.setCurrentStation(5);
        cond.nextStation();
        int expected = 6;
        int actual = cond.getCurrentStation();
        assertEquals(expected, actual);


    }

    @Test
    public void prevStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);
        cond.prevStation();
        int expected = 10;
        assertEquals(expected, cond.getCurrentStation());

    }

    @Test
    public void prevStationPrev() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);
        cond.prevStation();
        int expected = 8;
        int actual = cond.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setSoundVolumeMax() {
        Radio cond = new Radio();
        int expected = 100;
        cond.setSoundVolume(expected);

        int actual = cond.getSoundVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void setSoundVolumeMin() {
        Radio cond = new Radio();
        int expected = 0;
        cond.setSoundVolume(expected);

        int actual = cond.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setSoundVolume() {
        Radio cond = new Radio();
        int expected = cond.getSoundVolume();
        cond.setSoundVolume(-15);

        int actual = cond.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setSoundVolumeIncreaseMax() {
        Radio cond = new Radio();
        int expected = 0;
        cond.setSoundVolume(101);

        int actual = cond.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setMinStation() {
        Radio cond = new Radio();
        int expected = 0;
        int actual = cond.getMinStation();
        cond.setMinStation(0);
        assertEquals(expected,actual);


    }




    @Test
    public void setMaxStation() {
        Radio cond = new Radio();
        int expected = 10;
        cond.setMaxStation(expected);
        assertEquals(expected, cond.getMaxStation());
    }

    @Test
    public void setMinVolume() {
        Radio cond = new Radio();
        int expected = 0;
        cond.setMinVolume(expected);
        assertEquals(expected, cond.getMinVolume());
    }

    @Test
    public void setMaxVolume() {
        Radio cond = new Radio();
        int expected = 100;
        cond.setMaxVolume(expected);
        assertEquals(expected, cond.getMaxVolume());
    }

    @Test
    public void increaseSoundVolume() {
        Radio cond = new Radio();
        int expected = 1;
        cond.setSoundVolume(expected);
        int actual = cond.getSoundVolume();
        assertEquals(expected, cond.getSoundVolume());

    }

    @Test
    public void increaseSoundVolume2() {
        Radio cond = new Radio();
        int expected = 100;
        cond.setSoundVolume(expected);
        int actual = cond.getSoundVolume();
        assertEquals(expected, cond.getSoundVolume());

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio cond = new Radio();
        int expected = 1;
        cond.increaseSoundVolume();
        int actual = cond.getSoundVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolumeNext() {
        Radio cond = new Radio();
        int expected = cond.getMinVolume();
        cond.setSoundVolume(-1);

        assertEquals(expected, cond.getSoundVolume());
    }


    @Test
    public void decreaseSoundVolume() {
        Radio cond = new Radio();
        int expected = 55;
        cond.setSoundVolume(expected);

        int actual = cond.getSoundVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void decreaseSoundVolumePrev() {
        Radio cond = new Radio();
        int expected = cond.getMinVolume();
        cond.setSoundVolume(0);

        int actual = cond.getSoundVolume();

        assertEquals(expected, actual);

    }

    @Test
    void volumeDoubleUpSoundVolume() {
        Radio cond = new Radio();
        cond.setSoundVolume(99);

        cond.increaseSoundVolume();
        cond.increaseSoundVolume();

        assertEquals(cond.getMaxVolume(), cond.getSoundVolume());
    }

    @Test
    void volumeDoubleDownSoundVolume() {
        Radio cond = new Radio();
        cond.setSoundVolume(1);

        cond.decreaseSoundVolume();
        cond.decreaseSoundVolume();

        assertEquals(cond.getMinVolume(), cond.getSoundVolume());
    }


}


