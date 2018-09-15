package PlatformaUBB.Model;

import Model.Professor;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProfessorTest {
    private static Professor professor;

    @BeforeClass
    public static void initializeField() {
        professor = new Professor.ProfessorBuilder()
                .username("u1")
                .completeName("c1")
                .email("e1")
                .password("p1")
                .createProfessor();
        Assert.assertEquals("u1", professor.getUsername());
        Assert.assertEquals("c1", professor.getCompleteName());
        Assert.assertEquals("e1", professor.getEmail());
        Assert.assertEquals("p1", professor.getPassword());
    }

    @Test
    public void usernameTest() {
        professor.setUsername("username");
        Assert.assertEquals("username", professor.getUsername());
    }

    @Test
    public void completeNameTest() {
        professor.setCompleteName("completeName");
        Assert.assertEquals("completeName", professor.getCompleteName());
    }

    @Test
    public void emaiTest() {
        professor.setEmail("email");
        Assert.assertEquals("email", professor.getEmail());
    }

    @Test
    public void passwordTest() {
        professor.setPassword("password");
        Assert.assertEquals("password", professor.getPassword());
    }
}
