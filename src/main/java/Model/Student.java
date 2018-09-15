package Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends User {
    private int classroom;
    private String specialization;
    /***
     * @param classroom represents the class membership of a certain specialization from a faculty
     * @param specialization represents the specific branch from a faculty
     */

    private Student() {
    }

    public static final class StudentBuilder {
        private Student student = new Student();

        public StudentBuilder() {
        }

        public StudentBuilder username(String newUsername) {
            student.setUsername(newUsername);
            return this;
        }

        public StudentBuilder completeName(String newCompleteName) {
            student.setCompleteName(newCompleteName);
            return this;
        }

        public StudentBuilder email(String newEmail) {
            student.setEmail(newEmail);
            return this;
        }

        public StudentBuilder password(String newPassword) {
            student.setPassword(newPassword);
            return this;
        }

        public StudentBuilder classroom(int newClassroom) {
            student.classroom = newClassroom;
            return this;
        }

        public StudentBuilder specialization(String newSpecialization) {
            student.specialization = newSpecialization;
            return this;
        }

        public Student createStudent() {
            return student;
        }
    }
}
