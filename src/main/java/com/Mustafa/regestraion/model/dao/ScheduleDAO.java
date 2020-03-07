package com.Mustafa.regestraion.model.dao;

import java.util.List;

public interface ScheduleDAO {
    List<String> findStudents(String CourseId);

    List<String> findCourses(String StudentId);

    boolean isRegistered(String studentId, String courseId);

    boolean addSchedule(String studentId, String courseId);

}
