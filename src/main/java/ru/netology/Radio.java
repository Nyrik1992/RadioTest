package ru.netology;

public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int NewCurrentStation) {
        if (NewCurrentStation < 0) {
            return;
        }
        if (NewCurrentStation > 9) {
            return;
        }
        currentStation = NewCurrentStation;
    }

    public void setToMaximum() {
        currentStation = 9;
    }

    public void setPlusOne() {
        if (currentStation < 9) {
            setCurrentStation(currentStation + 1);
        } else {
            currentStation = 0;
        }
    }


    public void setMinusOne() {
        if (currentStation > 0) {
            setCurrentStation(currentStation - 1);
        } else {
            currentStation = 9;
        }
    }

    public void setToMinimum() {
        currentStation = 0;
    }


    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int NewCurrentVolume) {
        if (NewCurrentVolume < 0) {
            return;
        }
        if (NewCurrentVolume > 10) {
            return;
        }
        currentVolume = NewCurrentVolume;
    }

    public int setToMaximumVolume() {
        currentVolume = 10;

        return 0;
    }

    public void setPlusOneVolume() {
        if (currentVolume < 10) {
            setCurrentVolume(currentVolume + 1);
        } else {
            currentVolume = 0;
        }
    }

    public void setMinusOneVolume() {
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        } else {
            currentVolume = 9;
        }
    }

    public void setToMinimumVolume() {
        currentVolume = 0;
    }

    public int increase50p() {
        currentVolume = 200 * currentVolume / 100;
        if (currentVolume < 10) {
            return currentVolume;
        }
        else {

        } {
            return setToMaximumVolume();
        }
    }
}
