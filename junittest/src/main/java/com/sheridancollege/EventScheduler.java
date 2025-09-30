package com.sheridancollege;

import java.util.ArrayList;
import java.util.List;

public class EventScheduler {
    private List<Event> eventList;

    public EventScheduler() {
        eventList = new ArrayList<>();
    }

    // Add an event
    public void addEvent(Event event) {
        if (event != null) {
            eventList.add(event);
        }
    }

    // Remove an event by name
    public boolean removeEvent(String eventName) {
        for (Event e : eventList) {
            if (e.getEventName().equalsIgnoreCase(eventName)) {
                eventList.remove(e);
                return true;
            }
        }
        return false;
    }

    // Get all events
    public List<Event> getAllEvents() {
        return eventList;
    }

    // Search event by name
    public Event searchEvent(String eventName) {
        for (Event e : eventList) {
            if (e.getEventName().equalsIgnoreCase(eventName)) {
                return e;
            }
        }
        return null;
    }

    // Get count of events
    public int getEventCount() {
        return eventList.size();
    }
}
