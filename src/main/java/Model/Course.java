package Model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Course {
    private String title;
    private List<Professor> admins;
    private List<Professor> tutors;
    private String description;
    private List<Student> students;
    private List<Task> tasks;

    public Course() {
    }
}
