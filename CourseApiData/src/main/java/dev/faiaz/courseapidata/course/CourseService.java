package dev.faiaz.courseapidata.course;

import dev.faiaz.courseapidata.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    public List<Course> getTopics(String id) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(id)
                .forEach(courses::add);
        return courses;
    }

    public Optional<Course> getCourse(String id) {
        return courseRepository.findById(id);

    }

    public void addCourse(Course course, String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        courseRepository.save(course);
    }

    public void updateTopic(String topicId, Course course) {
        course.setTopic(new Topic(topicId, "", ""));
        courseRepository.save(course);
    }

    public void deleteTopic(String id) {
        courseRepository.deleteById(id);
    }
}


