/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airshow;

import calendar.api.CalendarEvent;
import calendar.api.CalendarEventException;
import calendar.api.Displayable;
import java.time.LocalDate;

/**
 *
 * @author claudio
 */
public class AirShow implements CalendarEvent, Displayable {

    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private String category;

    private AirShow(String name, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public LocalDate getStartDate() {
        return startDate;
    }

    @Override
    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public String getCategory() {
        return category;
    }

    public AirShow setCategory(String category) {
        this.category = category;
        return this;
    }

    @Override
    public String getTitle() {
        return getName();
    }

    @Override
    public String getLocation() throws CalendarEventException {
        throw new CalendarEventException("Location is not supported by " + this.getClass() + " yet.");
    }

    @Override
    public String getDescription() {
        return this.name + " is a wonderful event. Please come and see it on " + startDate + "!";
    }

    public static class Builder {

        private String name;
        private LocalDate startDate;
        private LocalDate endDate;

        public Builder() {

        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setStartDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setEndDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        public AirShow build() {
            endDate = (endDate != null) ? endDate : startDate;
            return new AirShow(name, startDate, endDate);
        }
    }
}
