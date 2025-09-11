package com.luv2code.mvc;

import com.luv2code.mvc.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;
    @NotNull(message = "Last name is required")
    @Size(min = 1, message = "Last name must have at least 1 character")
    private String lastName;

    @Min(value = 0, message = "Must be greater than or equal to 0")
    @Max(value = 10, message = "Must be less than or equal to 10")
    @NotNull(message = "Number of free passes is required")
    private Integer freePasses;
    @Pattern(regexp = "^[A-Za-z0-9]{5}", message = "Only 5 chars/digits are allowed")
    private String postalCode;
    @CourseCode
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
