package Model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Task {
    /***
     * @field idTask represents the name of the task
     * @field deadline represents the time until this task should be done by students
     * @field gradingWeight represents the weight assigned to this task from the total course grade which is 1 (100%);
     * it must be a value between 0 and 1
     * @field submissionLimit represents the maximum attempts a student can take for this task
     * @field description represents the description of the task
     * @field course represents the course the task belongs to
     */
    private String taskId;
    private Date deadline;
    private double gradingWeight;
    private int submissionLimit;
    private String description;
    private Course course;

    public Task() {
    }
}
