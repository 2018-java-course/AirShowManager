/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airshow.util;

import airshow.AirShow;
import airshow.AirShowCategory;
import calendar.api.CalendarEvent;
import calendar.api.CalendarEventDatabase;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author claudio
 */
public class AirShowDatabase implements CalendarEventDatabase {

    @Override
    public void populate(ArrayList<CalendarEvent> events) {

        events.add(new AirShow.Builder()
                .setName("Festa dei piloti")
                .setStartDate(LocalDate.of(2018, 6, 29))
                .build()
                .setCategory(AirShowCategory.FUN));

        events.add(new AirShow.Builder()
                .setName("Arona Air Show")
                .setStartDate(LocalDate.of(2018, 6, 30))
                .build()
                .setCategory(AirShowCategory.BUSINESS));

        events.add(new AirShow.Builder()
                .setName("Palermo Air Show")
                .setStartDate(LocalDate.of(2018, 7, 7))
                .build()
                .setCategory(AirShowCategory.BUSINESS));
    }

}
