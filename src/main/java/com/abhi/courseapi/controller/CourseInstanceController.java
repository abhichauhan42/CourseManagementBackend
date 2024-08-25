package com.abhi.courseapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.courseapi.entity.CourseInstance;
import com.abhi.courseapi.service.CourseInstanceService;

@RestController
@RequestMapping("/api/instances")
@CrossOrigin(origins = "http://localhost:3000")
public class CourseInstanceController {
    @Autowired
    private CourseInstanceService courseInstanceService;

    @PostMapping
    public CourseInstance createInstance(@RequestBody CourseInstance instance) {
        return courseInstanceService.createCourseInstance(instance);
    }

    @GetMapping("/{year}/{semester}")
    public List<CourseInstance> getInstancesByYearAndSemester(
            @PathVariable int year, @PathVariable int semester) {
        return courseInstanceService.getInstancesByYearAndSemester(year, semester);
    }

    @GetMapping("/{year}/{semester}/{id}")
    public CourseInstance getInstanceById(
            @PathVariable int year, @PathVariable int semester, @PathVariable Long id) {
        return courseInstanceService.getInstanceById(id);
    }

    @DeleteMapping("/{year}/{semester}/{id}")
    public void deleteInstance(@PathVariable int year, @PathVariable int semester, @PathVariable Long id) {
        courseInstanceService.deleteInstance(id);
    }
}
