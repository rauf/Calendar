package com.company.calendar.models;

/**
 * Created by abdul on 19-Jun-17.
 */

//stored in cloud
public class AlarmCounter {
    public static final String ALARM_COUNTER_FIELD = "alarm_counter";

    private int count;

    public AlarmCounter() {
        //required
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
