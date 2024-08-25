package com.abhi.courseapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.abhi.courseapi.entity.CourseInstance;

public interface CourseInstanceRepository extends JpaRepository<CourseInstance, Long> {
    List<CourseInstance> findByYearAndSemester(int year, int semester);
}