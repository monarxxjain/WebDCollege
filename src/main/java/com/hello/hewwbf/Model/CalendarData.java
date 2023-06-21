package com.hello.hewwbf.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "calendar")
public class CalendarData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int userId;

    @Column
    private String title;

    @Column
    private String start;

    @Column
    private Boolean allDay;

    public CalendarData() {
    }

    public CalendarData(int userId, String title, String start, Boolean allDay) {
        this.userId = userId;
        this.title = title;
        this.start = start;
        this.allDay = allDay;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart() {
        return this.start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public Boolean isAllDay() {
        return this.allDay;
    }

    public Boolean getAllDay() {
        return this.allDay;
    }

    public void setAllDay(Boolean allDay) {
        this.allDay = allDay;
    }

}
