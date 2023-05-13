package academy.devdojo.aluno.course.endpoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Service;

import academy.devdojo.aluno.course.endpoint.repository.CourseRepository;
import academy.devdojo.aluno.course.model.Course;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j

public class CourseService {
    
    @Autowired
    CourseRepository courseRepository;

    public Iterable<Course> list (Pageable pageable){
        log.info("Listing all course");
        return courseRepository.findAll(pageable);
    }
}
