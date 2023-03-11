package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldUseConstructor() {
        Radio radio = new Radio(10 );
        assertEquals(0,radio.getCurrentStation());

        Radio radio1 = new Radio();
        assertEquals(0, radio1.getCurrentStation());
    }

    @Test
    public void test() {
        Radio radio = new Radio();
        radio.getCurrentStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println(actual + " Текущая радиостанция");
    }

    @Test
    public void PutAnotherStation11() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void PutAnotherStation10() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void PutAnotherStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);

    }

    @Test
    public void PutAnotherStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void PutAnotherStationMinus1() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void MaximumStation() {
        Radio radio = new Radio();
        radio.setToMaximum();
        int expected = 10;
        int actual = radio.getMaxAmountStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void StationPlusOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        radio.setPlusOne();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void StationPlusOne10() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.setPlusOne();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void StationPlusOne9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setPlusOne();
        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void StationPlusOneMinus1() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.setPlusOne();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void StationPlusOne0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPlusOne();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void StationPlusOne2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.setPlusOne();
        int expected = 2;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void StationMinusOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setMinusOne();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void StationMinusOne1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.setMinusOne();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void StationMinusOneMinus1() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.setMinusOne();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void StationMinusOne10() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        radio.setMinusOne();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void StationMinusOne9() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.setMinusOne();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void StationMinusOne8() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setMinusOne();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void StationMinusOne11() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setMinusOne();
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void setToMinimumStation() {
        Radio radio = new Radio();
        radio.setToMinimum();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
        System.out.println("Нoвая радиостанция " + actual);
    }

    @Test
    public void test2() {
        Radio radio = new Radio();
        radio.getCurrentVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("Текущая громкость равна " + actual);
    }

    @Test
    public void PutAnotherVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("Текущая громкость равна " + actual);
    }

//    @Test
//    public void PutAnotherVolume11() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(101);
//        int expected = 100;
//        int actual = radio.setToMaximumVolume();
//        assertEquals(expected, actual);
//        System.out.println("Текущая громкость равна " + actual);
//    }

    @Test
    public void PutAnotherVolume9() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("Текущая громкость равна " + actual);
    }

    @Test
    public void PutAnotherVolumeMinus1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("Текущая громкость равна " + actual);
    }

    @Test
    public void PutAnotherVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("Текущая громкость равна " + actual);
    }

    @Test
    public void PutAnotherVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("Текущая громкость равна " + actual);
    }

    @Test
    public void MaximumStationVolume() {
        Radio radio = new Radio();
        radio.setToMaximumVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("Текущая громкость равна " + actual);
    }

    @Test
    public void StationPlusOneVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setPlusOneVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("Текущая громкость равна " + actual);
    }

    @Test
    public void StationPlusOneVolume9() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.setPlusOneVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("Текущая громкость равна " + actual);
    }

    @Test
    public void StationPlusOneVolume11() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.setPlusOneVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("Текущая громкость равна " + actual);
    }

//    @Test
//    public void StationPlusOneVolumeMinus1() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(-1);
//        radio.setPlusOneVolume();
//        int expected = 1;
//        int actual = radio.getCurrentVolume();
//        assertEquals(expected, actual);
//        System.out.println("Текущая громкость равна " + actual);
//    }

    @Test
    public void StationPlusOneVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.setPlusOneVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("Текущая громкость равна " + actual);
    }

    @Test
    public void StationPlusOneVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setPlusOneVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("Текущая громкость равна " + actual);
    }

    @Test
    public void StationMinusOneVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setMinusOneVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("Текущая громкость равна " + actual);
    }

    @Test
    public void StationMinusOneVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.setMinusOneVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("Текущая громкость равна " + actual);
    }

    @Test
    public void StationMinusOneVolume11() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setMinusOneVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("Текущая громкость равна " + actual);
    }

//    @Test
//    public void StationMinusOneVolume10() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(10);
//        radio.setMinusOneVolume();
//        int expected = 9;
//        int actual = radio.getCurrentVolume();
//        assertEquals(expected, actual);
//        System.out.println("Текущая громкость равна " + actual);
//    }
//
//    @Test
//    public void StationMinusOneVolume9() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(9);
//        radio.setMinusOneVolume();
//        int expected = 8;
//        int actual = radio.getCurrentVolume();
//        assertEquals(expected, actual);
//        System.out.println("Текущая громкость равна " + actual);
//    }

    @Test
    public void setToMinimumStationVolume() {
        Radio radio = new Radio();
        radio.setToMinimumVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("Текущая громкость равна " + actual);
    }

    @Test
    public void increase50p() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increase50p();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("Текущая громкость равна " + actual);
    }

    @Test
    public void increase50p10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increase50p();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
        System.out.println("Текущая громкость равна " + actual);
    }

//    @Test
//    public void increase50p11() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(101);
//        radio.increase50p();
//        int expected = 100;
//        int actual = radio.getCurrentVolume();
//        assertEquals(expected, actual);
//        System.out.println("Текущая громкость равна " + actual);
//    }
//
//    @Test
//    public void increase50pMinus1() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(-1);
//        radio.increase50p();
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//        assertEquals(expected, actual);
//        System.out.println("Текущая громкость равна " + actual);
//    }
//
//    @Test
//    public void increase50p0() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(0);
//        radio.increase50p();
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//        assertEquals(expected, actual);
//        System.out.println("Текущая громкость равна " + actual);
//    }
//
//    @Test
//    public void increase50p1() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(1);
//        radio.increase50p();
//        int expected = 2;
//        int actual = radio.getCurrentVolume();
//        assertEquals(expected, actual);
//        System.out.println("Текущая громкость равна " + actual);
//    }
//
//    @Test
//    public void increase50p20000() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(20000);
//        radio.increase50p();
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//        assertEquals(expected, actual);
//        System.out.println("Текущая громкость равна " + actual);
//    }
//
//    @Test
//    public void increase50p8() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(8);
//        radio.increase50p();
//        int expected = 10;
//        int actual = radio.getCurrentVolume();
//        assertEquals(expected, actual);
//        System.out.println("Текущая громкость равна " + actual);
//
//    }
//
//    @Test
//    public void increase50p12() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(12);
//        radio.increase50p();
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//        assertEquals(expected, actual);
//        System.out.println("Текущая громкость равна " + actual);
//
//    }

//    @Test
//    public  void shouldUseConstructor (){
//        Radio radio = new Radio(currentStation:6, String name: "Radio1", maxStation:12, minStation:0, on: true,currentVolume:50, maxVolume:100, minVolume:0 );
}


