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
        cond.setCurrentStation(10);
        cond.prevStation();
        int expected = 9;
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
        cond.setSoundVolume(-1);

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
    public void increaseSoundVolume() {
        Radio cond = new Radio();
        int expected = 1;
        cond.setSoundVolume(expected);

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


