package pl.mslezak2.euniversity.data;

import javax.persistence.*;

@Entity
public class Lecturer {

    @Id
    private long userId;

    @OneToOne
    private Credentials credentials;

    private long employeeId;

    //TODO: zamienić na enum i wprowadzić validację
    private String degree;

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

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
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
