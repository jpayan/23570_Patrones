package Behaviors;

public class PhoneBehavior implements Validatable {
    @Override
    public boolean validate(String input) {
        return input.matches("\\(?\\d{3}\\)?[\\s\\-]?\\d{3}\\-?\\d{4}");
    }
}
