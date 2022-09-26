package com.utm.zooworkers;

public class Zookeeper {
    private boolean isFeeding;
    private boolean isCleaning;

    public boolean isFeeding() {
        return isFeeding;
    }

    public void setFeeding(boolean feeding) {
        isFeeding = feeding;
    }

    public boolean isCleaning() {
        return isCleaning;
    }

    public void setCleaning(boolean cleaning) {
        isCleaning = cleaning;
    }
}
