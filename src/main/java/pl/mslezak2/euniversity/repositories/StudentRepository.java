package pl.mslezak2.euniversity.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mslezak2.euniversity.data.Student;

public interface StudentRepository extends CrudRepository<Student,Long> {

}
