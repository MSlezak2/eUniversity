package pl.mslezak2.euniversity.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mslezak2.euniversity.data.Course;

public interface CourseRepository extends CrudRepository<Course,Long> {

}
