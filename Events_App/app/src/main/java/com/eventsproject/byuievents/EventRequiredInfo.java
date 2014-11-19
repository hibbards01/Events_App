package com.eventsproject.byuievents;

/**
 * Created by Grant on 11/19/2014.
 */
public class EventRequiredInfo {
    private String startTime;
    private String endTime;
    private String date;
    private String location;
    private String name;

    /**
     * Returns the startTime of an event
     * @return String startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the startTime of an event to a new startTime
     * @param startTime new startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * Returns the endTime of an event
     * @return String endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the endTime of an event to a new endTime
     * @param endTime new endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * Returns the date of an event
     * @return String date
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the date of an event to a new date
     * @param date new date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Returns the location of an event
     * @return String location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the location of an event to a new location
     * @param location new location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Returns the name of an event
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of an event to a new name
     * @param name new name
     */
    public void setName(String name) {
        this.name = name;
    }
}
