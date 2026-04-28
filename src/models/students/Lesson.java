package src.models.students;

import src.enums.LessonType;

import java.io.Serializable;
import java.util.Date;

public class Lesson implements Serializable {

    private LessonType lessonType;
    private String room;
    private Date schedule;

    public Lesson() {}

    public Lesson(LessonType lessonType, String room, Date schedule) {
        this.lessonType = lessonType;
        this.room = room;
        this.schedule = schedule;
    }

    public LessonType getLessonType() { return lessonType; }
    public String getRoom() { return room; }
    public Date getSchedule() { return schedule; }

    public void setLessonType(LessonType lessonType) { this.lessonType = lessonType; }
    public void setRoom(String room) { this.room = room; }
    public void setSchedule(Date schedule) { this.schedule = schedule; }

    public void getInfo() {
        System.out.printf("Lesson[ %s | Room: %s | Time: %s ]%n",
                lessonType, room, schedule);
    }

    @Override
    public String toString() {
        return String.format("Lesson[ %s | Room: %s | %s ]",
                lessonType, room, schedule);
    }
}