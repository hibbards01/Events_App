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
    private EventRequiredInfo eventRequiredInfo;
    private EventOptionalInfo eventOptionalInfo;

    /**
     * CONSTRUCTOR
     * @param eventRequiredInfo
     * @param eventOptionalInfo
     */
    public Event(EventRequiredInfo eventRequiredInfo, EventOptionalInfo eventOptionalInfo) {
        this.eventRequiredInfo = eventRequiredInfo;
        this.eventOptionalInfo = eventOptionalInfo;
    }

    /**
     * Returns the eventRequiredInfo
     * @return EventRequiredInfo eventRequiredInfo
     */
    public EventRequiredInfo getEventRequiredInfo() {
        return eventRequiredInfo;
    }

    /**
     * Sets the eventRequiredInfo
     * @param eventRequiredInfo new eventRequiredInfo
     */
    public void setEventRequiredInfo(EventRequiredInfo eventRequiredInfo) {
        this.eventRequiredInfo = eventRequiredInfo;
    }

    /**
     * Returns the name of the event.
     * @return String name
     */
    public String getName() {
        return this.eventRequiredInfo.getName();
    }

    /**
     * Returns the startTime of the event
     * @return String startTime
     */
    public String getStartTime() {
        return this.eventRequiredInfo.getStartTime();
    }

    /**
     * Returns the endTime of the event
     * @return String endTime
     */
    public String getEndTime() {
        return this.eventRequiredInfo.getEndTime();
    }

    /**
     * Returns the location of the event
     * @return String location
     */
    public String getLocation() {
        return this.eventRequiredInfo.getLocation();
    }

    /**
     * Returns the date of the event
     * @return String date
     */
    public String getDate() {
        return this.eventRequiredInfo.getDate();
    }

    /**
     * Returns the eventOptionalInfo
     * @return EventOptionalInfo eventOptionalInfo
     */
    public EventOptionalInfo getEventOptionalInfo() {
        return eventOptionalInfo;
    }

    /**
     * Sets the eventOptionalInfo
     * @param eventOptionalInfo new eventOptionalInfo
     */
    public void setEventOptionalInfo(EventOptionalInfo eventOptionalInfo) {
        this.eventOptionalInfo = eventOptionalInfo;
    }

    /**
     * Returns the description of the event
     * @return String description
     */
    public String getDescription() {
        return this.eventOptionalInfo.getDescription();
    }

}
