package com.abhi.courseapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.courseapi.entity.CourseInstance;
import com.abhi.courseapi.repository.CourseInstanceRepository;

@Service
public class CourseInstanceService {
    @Autowired
    private CourseInstanceRepository courseInstanceRepository;

    public CourseInstance createCourseInstance(CourseInstance instance) {
        return courseInstanceRepository.save(instance);
    }

    public List<CourseInstance> getInstancesByYearAndSemester(int year, int semester) {
        return courseInstanceRepository.findByYearAndSemester(year, semester);
    }

    public CourseInstance getInstanceById(Long id) {
        return courseInstanceRepository.findById(id).orElse(null);
    }

    public void deleteInstance(Long id) {
        courseInstanceRepository.deleteById(id);
    }
}
