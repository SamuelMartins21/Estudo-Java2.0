package academy.devdojo.aluno.course.endpoint.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import academy.devdojo.aluno.course.model.Course;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
    
}
