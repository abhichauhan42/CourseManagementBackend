package com.abhi.courseapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abhi.courseapi.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
