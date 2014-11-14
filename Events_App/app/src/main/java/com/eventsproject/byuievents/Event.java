package com.eventsproject.byuievents;

import java.util.Date;
import java.util.Calendar;
import java.util.Map;

/**
 * EVENT
 *  This will contain all the information for the event
 * Created by SamuelHibbard on 11/11/14.
 */
public class Event {
    /*
     * MEMBER VARIABLES
     */
    private Calendar date;
    private String location;
    private String title;

    /*
     * MEMBER METHODS
     */

    /**
     * CONSTRUCTOR
     * @param date
     * @param name
     * @param location
     */
    public Event(Map<String, Integer> date, String name, String location) {
        this.date = Calendar.getInstance();
        int year = 0;
        int month = 0;
        int day = 0;
        int hourOfDay = 0;
        int minute = 0;
        int second = 0;

        for (Map.Entry datePart : date.entrySet()) {

        }
        this.date.set(year, month, day, hourOfDay, minute, second);
        this.location = location;
        this.title = name;
    }

    /**
     * GETTERS
     */
    public Calendar getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return title;
    }

    /**
     * SETTERS
     */
    public void setDate(Calendar newDate) {
        date = newDate;
    }

    public void setLocation(String newLocation) {
        location = newLocation;
    }

    public void setName(String newName) {
        title = newName;
    }
}
