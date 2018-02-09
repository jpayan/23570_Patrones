package Behaviors;

public class NumberBehavior implements Validatable {
    @Override
    public boolean validate(String input) {
        return input.matches("\\d+");
    }
}
