package pl.mslezak2.euniversity.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mslezak2.euniversity.data.Lecturer;

public interface LecturerRepository extends CrudRepository<Lecturer,Long> {

}
