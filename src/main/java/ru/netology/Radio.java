package ru.netology;

public class Radio {
    private int currentStation;
    private int maxAmountStation = 10;

    public Radio(int maxAmountStation) {
        this.maxAmountStation = maxAmountStation;
    }

    public Radio() {

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxAmountStation(){
        return maxAmountStation;
    }

    public void setCurrentStation(int NewCurrentStation) {
        if (NewCurrentStation < 0) {
            return;
        }
        if (NewCurrentStation > maxAmountStation) {
            return;
        }
        this.currentStation = NewCurrentStation;
    }

    public void setToMaximum() {
      this.maxAmountStation = 10;
}
    public void setPlusOne() {
        if (currentStation < maxAmountStation) {
            this.currentStation = currentStation + 1;
        } else {
            this.currentStation = 0;
        }
    }


    public void setMinusOne() {
        if (currentStation > 0) {
            this.currentStation =currentStation - 1;
        } else {
            this.currentStation = maxAmountStation -1;
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
        if (NewCurrentVolume > 100) {
            return;
        }
        this.currentVolume = NewCurrentVolume;
    }

    public int setToMaximumVolume() {
        currentVolume = 100;

        return 0;
    }

    public void setPlusOneVolume() {
        if (currentVolume < 100) {
            setCurrentVolume(currentVolume + 1);
        } else {
           this.currentStation = 100;
        }
    }

    public void setMinusOneVolume() {
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        } else {
            currentVolume = 0;
        }
    }

    public void setToMinimumVolume() {
        currentVolume = 0;
    }

    public int increase50p() {
        currentVolume = 200 * currentVolume / 100;
        if (currentVolume < 100) {
            return currentVolume;
        } else {
        }
        {
            return setToMaximumVolume();
        }
    }
}
