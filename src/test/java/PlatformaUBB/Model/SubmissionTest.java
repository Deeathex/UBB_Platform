package PlatformaUBB.Model;

import Model.Submission;
import Model.Task;
import Model.User;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

import java.util.Date;

public class SubmissionTest {
    private static User user = new User();
    private static Task task = new Task();
    private static Submission submission;

    @BeforeClass
    public static void initializeFields() {
        user.setUsername("username");
        task.setDescription("description");
        submission = new Submission(user, task, new Date(4005), 10.0);
    }

    @Test
    public void userTest() {
        assertEquals(user, submission.getUser());
    }

    @Test
    public void taskTest() {
        assertEquals(task, submission.getTask());
    }

    @Test
    public void dateTest() {
        assertEquals(new Date(4005), submission.getDate());
    }

    @Test
    public void gradeTest() {
        assertEquals(10.0, submission.getGrade(), 0.001);
        submission.setGrade(100.0);
        assertEquals(100.0, submission.getGrade(), 0.001);
    }
}
