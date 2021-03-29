package pl.mslezak2.euniversity.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.mslezak2.euniversity.data.Student;
import pl.mslezak2.euniversity.repositories.CourseRepository;
import pl.mslezak2.euniversity.repositories.LecturerRepository;
import pl.mslezak2.euniversity.repositories.StudentRepository;

public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private final StudentRepository studentRepository;
    @Autowired
    private final LecturerRepository lecturerRepository;
    @Autowired
    private final CourseRepository courseRepository;

    public MyUserDetailsService(StudentRepository studentRepository, LecturerRepository lecturerRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.lecturerRepository = lecturerRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Student student = studentRepository.findById(Long.parseLong(username)).orElseThrow();
        return student;
    }

}
