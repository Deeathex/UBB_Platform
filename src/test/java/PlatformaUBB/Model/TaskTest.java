package PlatformaUBB.Model;

import Model.Course;
import Model.Task;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class TaskTest {
    private static Course course = new Course();
    private static Task task = new Task();

    @BeforeClass
    public static void initializeFields() {
        course.setTitle("course");
    }

    @Test
    public void idTaskTest() {
        task.setIdTask("idTask");
        assertEquals("idTask", task.getIdTask());
    }

    @Test
    public void deadlineTest() {
        task.setDeadline(new Date(4005));
        assertEquals(new Date(4005), task.getDeadline());
    }

    @Test
    public void gradingWeightTest() {
        task.setGradingWeight(0.5);
        assertEquals(0.5, task.getGradingWeight(), 0.0001);
    }

    @Test
    public void submissionLimitTest() {
        task.setSubmissionLimit(10);
        assertEquals(10, task.getSubmissionLimit());
    }

    @Test
    public void descriptionTest() {
        task.setDescription("description");
        assertEquals("description", task.getDescription());
    }

    @Test
    public void courseTest() {
        task.setCourse(course);
        assertEquals(course, task.getCourse());
    }
}
