package com.sparta.week01.prac;

public class Course {
    private String title;
    private String tutor;
    private int days;

    public Course() {

    }

    public Course(String title, String tutor, int days) {
        this.title = title;
        this.tutor = tutor;
        this.days = days;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", tutor='" + tutor + '\'' +
                ", days=" + days +
                '}';
    }
}