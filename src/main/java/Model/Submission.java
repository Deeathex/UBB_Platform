package Model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Submission {
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private int submissionId;
    private final User user;
    private final Task task;
    private final Date date;
    private double grade;

    public Submission(User user, Task task, Date date, double grade) {
        this.user = user;
        this.task = task;
        this.date = date;
        this.grade = grade;
    }
}
