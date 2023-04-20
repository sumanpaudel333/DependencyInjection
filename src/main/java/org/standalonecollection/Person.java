package org.standalonecollection;

import java.util.List;
import java.util.Map;

public class Person {
    private List<String> friends;
    private Map<String,String> student;

    public Map<String, String> getStudent() {
        return student;
    }

    public void setStudent(Map<String, String> student) {
        this.student = student;
    }

    public Person() {
    }


    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", student=" + student +
                '}';
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }
}
