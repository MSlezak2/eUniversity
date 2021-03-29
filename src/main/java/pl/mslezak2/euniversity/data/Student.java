package pl.mslezak2.euniversity.data;

import javax.persistence.*;
//import javax.validation.constraints.NotBlank;

@Entity
public class Student {

    @Id
    private long userId;

    @OneToOne
    private Credentials credentials;

    private long studentId;

//    @NotBlank
    private String firstName;

    private String middleName;

//    @NotBlank
    private String lastName;

    ///////////////////

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
