package com.sheridancollege;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EventSchedulerTest {

    private EventScheduler scheduler;

    @BeforeEach
    void setup() {
        scheduler = new EventScheduler();
    }

    @Test
    void testAddEvent() {
        Event e1 = new Event("College Fest", "2025-10-10", "5:00 PM", "Auditorium");
        scheduler.addEvent(e1);
        assertEquals(1, scheduler.getEventCount());
    }

    @Test
    void testSearchEvent() {
        Event e2 = new Event("Hackathon", "2025-11-01", "10:00 AM", "B203");
        scheduler.addEvent(e2);

        Event found = scheduler.searchEvent("Hackathon");
        assertNotNull(found);
        assertEquals("Hackathon", found.getEventName());
    }

    @Test
    void testRemoveEvent() {
        Event e3 = new Event("Potluck", "2025-12-12", "6:30 PM", "Cafeteria");
        scheduler.addEvent(e3);

        boolean removed = scheduler.removeEvent("Potluck");
        assertTrue(removed);
        assertEquals(0, scheduler.getEventCount());
    }

    @Test
    void testEmptySearch() {
        Event result = scheduler.searchEvent("NotExist");
        assertNull(result);
    }
}
