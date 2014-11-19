package com.eventsproject.byuievents;

import java.sql.Blob;
import java.util.List;

/**
 * Created by Grant on 11/19/2014.
 */
public class EventOptionalInfo {
    private String description;
    private Blob image;
    private List<String> calendars;

    /**
     * Returns the description of an event.
     * @return String description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of an event to a new description
     * @param description new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the image of an event
     * @return Blob image
     */
    public Blob getImage() {
        return image;
    }

    /**
     * Sets the image of an event to a new image
     * @param image new image
     */
    public void setImage(Blob image) {
        this.image = image;
    }

    /**
     * Returns the list of all the calendars the event falls under.
     * @return List(String) calendars
     */
    public List<String> getCalendars() {
        return calendars;
    }

    /**
     * Sets the list of the calendars the event falls under to a new list.
     * @param calendars new calendars
     */
    public void setCalendars(List<String> calendars) {
        this.calendars = calendars;
    }
}
