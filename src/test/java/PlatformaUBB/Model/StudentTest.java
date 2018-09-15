package PlatformaUBB.Model;

import Model.Student;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentTest {
    private static Student student;

    @BeforeClass
    public static void initializeField() {
        student = new Student.StudentBuilder()
                .username("u1")
                .completeName("c1")
                .email("e1")
                .password("p1")
                .specialization("s1")
                .classroom(100)
                .createStudent();
        Assert.assertEquals("u1", student.getUsername());
        Assert.assertEquals("c1", student.getCompleteName());
        Assert.assertEquals("e1", student.getEmail());
        Assert.assertEquals("p1", student.getPassword());
        Assert.assertEquals("s1", student.getSpecialization());
        Assert.assertEquals(100, student.getClassroom());
    }

    @Test
    public void usernameTest() {
        student.setUsername("username");
        Assert.assertEquals("username", student.getUsername());
    }

    @Test
    public void completeNameTest() {
        student.setCompleteName("completeName");
        Assert.assertEquals("completeName", student.getCompleteName());
    }

    @Test
    public void emaiTest() {
        student.setEmail("email");
        Assert.assertEquals("email", student.getEmail());
    }

    @Test
    public void passwordTest() {
        student.setPassword("password");
        Assert.assertEquals("password", student.getPassword());
    }

    @Test
    public void specializationTest() {
        student.setSpecialization("specialization");
        Assert.assertEquals("specialization", student.getSpecialization());
    }

    @Test
    public void classroomTest() {
        student.setClassroom(222);
        Assert.assertEquals(222, student.getClassroom());
    }
}
