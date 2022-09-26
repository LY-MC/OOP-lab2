package com.utm.zooworkers;

import java.util.List;

public class SecurityGuard {
    private int hoursSlept;
    private boolean isSleeping;

    public SecurityGuard() {
        this.hoursSlept = 0;
        this.isSleeping = false;
    }

    public int getHoursSlept() {
        return hoursSlept;
    }

    public void setHoursSlept(int hoursSlept) {
        this.hoursSlept = hoursSlept;
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }
}
