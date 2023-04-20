package org.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype") // defining bean scope through annotation
public class StereoDemo {
    @Value("Suman")
    private String studentName;
    @Value("Kathmandu")
    private String city;

    @Value("#{tempList}")
    private List<String> numbers;

    @Override
    public String toString() {
        return "StereoDemo{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", numbers=" + numbers +
                '}';
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
