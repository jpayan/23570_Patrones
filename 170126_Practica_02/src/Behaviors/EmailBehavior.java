package Behaviors;

public class EmailBehavior implements Validatable {
    @Override
    public boolean validate(String input) {
        return input.matches("^[\\w\\.\\-]+\\@[\\w\\.\\-]+\\.[\\w]+$");
    }
}
