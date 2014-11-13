package com.eventsproject.byuievents;

/**
 * EVENT
 *  This will contain all the information for the event
 * Created by SamuelHibbard on 11/11/14.
 */
public class Event {
    /*
     * MEMBER VARIABLES
     */
    private String date;
    private String location;
    private String name;

    /*
     * MEMBER METHODS
     */

    /**
     * CONSTRUCTOR
     * @param date
     * @param name
     * @param location
     */
    Event(String date, String name, String location) {
        this.date = date;
        this.location = location;
        this.name = name;
    }

    /**
     * GETTERS
     */
    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    /**
     * SETTERS
     */
    public void setDate(String newDate) {
        date = newDate;
    }

    public void setLocation(String newLocation) {
        location = newLocation;
    }

    public void setName(String newName) {
        name = newName;
    }
}
