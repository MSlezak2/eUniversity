package pl.mslezak2.euniversity.data;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long courseId;

    //    @NotBlank
    private String name;

//    @NotBlank
    @OneToOne
    private Lecturer lecturer;

    @ManyToMany
    private List<Student> attendants;

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public List<Student> getAttendants() {
        return attendants;
    }

    public void setAttendants(List<Student> attendants) {
        this.attendants = attendants;
    }
}
