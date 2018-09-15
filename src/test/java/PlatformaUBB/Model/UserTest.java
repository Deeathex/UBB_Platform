package PlatformaUBB.Model;

import Model.User;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    private User user = new User();

    @Test
    public void usernameTest() {
        user.setUsername("username");
        Assert.assertEquals("username", user.getUsername());
    }

    @Test
    public void completeNameTest() {
        user.setCompleteName("completeName");
        Assert.assertEquals("completeName", user.getCompleteName());
    }

    @Test
    public void emaiTest() {
        user.setEmail("email");
        Assert.assertEquals("email", user.getEmail());
    }

    @Test
    public void passwordTest() {
        user.setPassword("password");
        Assert.assertEquals("password", user.getPassword());
    }
}
