package Model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String username;
    private String completeName;
    private String email;
    private String password;

    public User() {
    }
}
