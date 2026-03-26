package cmo.hky.GroupactivitiesbyuserId;

import java.time.LocalDate;

class Activity {
    private String userId;
    private LocalDate date;

    public Activity(String userId, LocalDate date) {
        this.userId = userId;
        this.date = date;
    }

    public String getUserId() {
        return userId;
    }

    public LocalDate getDate() {
        return date;
    }
}