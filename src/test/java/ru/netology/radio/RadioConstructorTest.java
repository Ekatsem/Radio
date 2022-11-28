package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioConstructorTest {

    @Test
    public void shouldSetStationQuantity() {
        Radio rad = new Radio(30);

        rad.setCurrentStation(20);

        Assertions.assertEquals(20, rad.getCurrentStation());
    }

    @Test
    public void shouldSetStationQuantityMin() {
        Radio rad = new Radio(30);

        rad.setCurrentStation(0);

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldSetStationQuantityMax() {
        Radio rad = new Radio(30);

        rad.setCurrentStation(29);

        Assertions.assertEquals(29, rad.getCurrentStation());
    }

    @Test
    public void shouldSetStationQuantityLower() {
        Radio rad = new Radio(30);

        rad.setCurrentStation(1);

        Assertions.assertEquals(1, rad.getCurrentStation());
    }
    @Test
    public void shouldSetStationQuantityUpper() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(28);

        Assertions.assertEquals(28, rad.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationQuantity() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(15);

        rad.nextStation();

        Assertions.assertEquals(16, rad.getCurrentStation());
    }
    @Test
    public void shouldSetNextStationQuantityMin() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(0);

        rad.nextStation();

        Assertions.assertEquals(1, rad.getCurrentStation());
    }
    @Test
    public void shouldSetNextStationQuantityMax() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(29);

        rad.nextStation();

        Assertions.assertEquals(0, rad.getCurrentStation());
    }
    @Test
    public void shouldSetNextStationQuantityLower() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(1);

        rad.nextStation();

        Assertions.assertEquals(2, rad.getCurrentStation());
    }
    @Test
    public void shouldSetNextStationQuantityUpper() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(28);

        rad.nextStation();

        Assertions.assertEquals(29, rad.getCurrentStation());
    }
    @Test
    public void shouldSetPrevStationQuantity() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(15);

        rad.prevStation();

        Assertions.assertEquals(14, rad.getCurrentStation());
    }
    @Test
    public void shouldSetPrevStationQuantityMin() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(0);

        rad.prevStation();

        Assertions.assertEquals(29, rad.getCurrentStation());
    }
    @Test
    public void shouldSetPrevStationQuantityMax() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(29);

        rad.prevStation();

        Assertions.assertEquals(28, rad.getCurrentStation());
    }
    @Test
    public void shouldSetPrevStationQuantityLower() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(1);

        rad.prevStation();

        Assertions.assertEquals(0, rad.getCurrentStation());
    }
    @Test
    public void shouldSetPrevStationQuantityUpper() {
        Radio rad = new Radio(30);
        rad.setCurrentStation(28);

        rad.prevStation();

        Assertions.assertEquals(27, rad.getCurrentStation());
    }
}