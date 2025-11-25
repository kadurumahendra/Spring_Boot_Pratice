package com.example.SpringBootApp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myapp")
public class School {

    private String schoolName;
    private String address;

    @Autowired
    private Principal principal;

    private List<Integer> classRooms;

    private Map<String, Integer> fees;

    public School() {
        super();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public List<Integer> getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(List<Integer> classRooms) {
        this.classRooms = classRooms;
    }

    public Map<String, Integer> getFees() {
        return fees;
    }

    public void setFees(Map<String, Integer> fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "School [schoolName=" + schoolName + ", address=" + address + ", principal=" + principal
                + ", classRooms=" + classRooms + ", fees=" + fees + "]";
    }
}
