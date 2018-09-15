package Model;

public class Professor extends User {

    private Professor() {
    }

    public static final class ProfessorBuilder {
        private Professor professor = new Professor();

        public ProfessorBuilder() {
        }

        public ProfessorBuilder username(String newUsername) {
            professor.setUsername(newUsername);
            return this;
        }

        public ProfessorBuilder completeName(String newCompleteName) {
            professor.setCompleteName(newCompleteName);
            return this;
        }

        public ProfessorBuilder email(String newEmail) {
            professor.setEmail(newEmail);
            return this;
        }

        public ProfessorBuilder password(String newPassword) {
            professor.setPassword(newPassword);
            return this;
        }

        public Professor createProfessor() {
            return professor;
        }
    }
}
