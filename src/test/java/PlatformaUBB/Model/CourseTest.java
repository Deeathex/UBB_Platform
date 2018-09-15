package PlatformaUBB.Model;

import Model.Course;
import Model.Professor;
import Model.Student;
import Model.Task;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CourseTest {
    private static Course course = new Course();
    private static List<Professor> admins = new ArrayList<>();
    private static List<Professor> tutors = new ArrayList<>();
    private static List<Student> students = new ArrayList<>();
    private static List<Task> tasks = new ArrayList<>();

    @BeforeClass
    public static void initializeFields() {
        admins.add(new Professor.ProfessorBuilder().createProfessor());
        admins.add(new Professor.ProfessorBuilder().username("admin").createProfessor());
        admins.add(new Professor.ProfessorBuilder().username("another admin").createProfessor());

        tutors.add(new Professor.ProfessorBuilder().createProfessor());
        tutors.add(new Professor.ProfessorBuilder().username("tutor").createProfessor());
        tutors.add(new Professor.ProfessorBuilder().username("another tutor").createProfessor());

        students.add(new Student.StudentBuilder().createStudent());
        students.add(new Student.StudentBuilder().username("student").createStudent());
        students.add(new Student.StudentBuilder().username("another student").createStudent());

        tasks.add(new Task());
        Task task = new Task();
        task.setIdTask("idTask");
        tasks.add(task);

    }

    @Test
    public void titleTest() {
        course.setTitle("title");
        assertEquals("title", course.getTitle());
    }

    @Test
    public void descriptionTest() {
        course.setDescription("description");
        assertEquals("description", course.getDescription());
    }

    @Test
    public void adminsTest() {
        course.setAdmins(admins);
        assertEquals(3, course.getAdmins().size());
        assertNull(course.getAdmins().get(0).getUsername());
        assertEquals("admin", course.getAdmins().get(1).getUsername());
        assertEquals("another admin", course.getAdmins().get(2).getUsername());
    }

    @Test
    public void tutorsTest() {
        course.setTutors(tutors);
        assertEquals(3, course.getTutors().size());
        assertNull(course.getTutors().get(0).getUsername());
        assertEquals("tutor", course.getTutors().get(1).getUsername());
        assertEquals("another tutor", course.getTutors().get(2).getUsername());
    }

    @Test
    public void studentsTest() {
        course.setStudents(students);
        assertEquals(3, course.getStudents().size());
        assertNull(course.getStudents().get(0).getUsername());
        assertEquals("student", course.getStudents().get(1).getUsername());
        assertEquals("another student", course.getStudents().get(2).getUsername());
    }

    @Test
    public void tasksTest() {
        course.setTasks(tasks);
        assertEquals(2, course.getTasks().size());
        assertNull(course.getTasks().get(0).getIdTask());
        assertEquals("idTask", course.getTasks().get(1).getIdTask());
    }
}
