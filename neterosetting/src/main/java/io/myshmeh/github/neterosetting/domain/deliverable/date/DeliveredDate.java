package io.myshmeh.github.neterosetting.domain.deliverable.date;

public class DeliveredDate {
    Year year;
    Day day;
    Month month;

    public DeliveredDate() {}

    public DeliveredDate(Year year, Day day, Month month) {
        this.year = year;
        this.day = day;
        this.month = month;
    }

    public Year year() {
        return year;
    }

    public Day day() {
        return day;
    }

    public Month month() {
        return month;
    }
}
