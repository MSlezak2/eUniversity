package pl.mslezak2.euniversity;

import org.springframework.web.bind.annotation.*;
import pl.mslezak2.euniversity.data.Course;
import pl.mslezak2.euniversity.data.Lecturer;
import pl.mslezak2.euniversity.data.Mail;
import pl.mslezak2.euniversity.data.Student;
import pl.mslezak2.euniversity.repositories.CourseRepository;
import pl.mslezak2.euniversity.repositories.LecturerRepository;
import pl.mslezak2.euniversity.repositories.StudentRepository;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
public class Controller {

    private final StudentRepository studentRepository;
    private final LecturerRepository lecturerRepository;
    private final CourseRepository courseRepository;

    public Controller(StudentRepository studentRepository, LecturerRepository lecturerRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.lecturerRepository = lecturerRepository;
        this.courseRepository = courseRepository;
    }

    @PostMapping("/api/addStudent")
    private Student addStudent(@RequestBody Student student) {

        studentRepository.save(student);

        return student;

    }

    @GetMapping("/api/getStudent/{id}")
    private Student getStudent(@PathVariable long id) {

        Student student = studentRepository.findById(id).orElseThrow();

        return student;

    }

    @PostMapping("/api/addLecturer")
    private Lecturer addLecturer(@RequestBody Lecturer lecturer) {

        lecturerRepository.save(lecturer);

        return lecturer;

    }

    @GetMapping("/api/getLecturer/{id}")
    private Lecturer getLecturer(@PathVariable long id) {

        Lecturer lecturer = lecturerRepository.findById(id).orElseThrow();

        return lecturer;

    }

    @PostMapping("/api/addCourse")
    private Course addCourse(@RequestBody Course course) {

        courseRepository.save(course);

        return course;

    }

    @GetMapping("/api/getCourse/{id}")
    private Course getCourse(@PathVariable long id) {

        Course course = courseRepository.findById(id).orElseThrow();

        return course;

    }

    @PostMapping("/email")
    public boolean sendEmail(@ModelAttribute @Valid Mail mail, HttpServletRequest gRequest){

        String responseToken = gRequest.getParameter("g-recaptcha-response");

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(mail.getRecipient());
        message.setText(mail.getMessageText());
        message.setFrom(mail.getSender());
        message.setSubject(mail.getSubject());
        try {
            mailSender.send(message);
        } catch (MailException me) {
            System.out.println(me.getMessage());
            return false;
        }

        return true;
    }

}
