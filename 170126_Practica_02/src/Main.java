import Behaviors.EmailBehavior;
import Behaviors.NumberBehavior;
import Behaviors.PhoneBehavior;
import Fields.*;

public class Main {
    public static void main(String[] args) {
        EmailField emailField = new EmailField("jalexpayan@gmail.com", new EmailBehavior());
        emailField.validate();
        System.out.println(emailField.getIsValid());

        emailField.setValue("asdlkfasdlfkjahsdflkj___!IUKYJUSHDF@asdlfkjhasd;;;;;.Comasdf");
        emailField.validate();
        System.out.println(emailField.getIsValid());

        NumberField numberField = new NumberField("123412349127341", new NumberBehavior());
        numberField.validate();
        System.out.println(numberField.getIsValid());

        numberField.setValue("12A491E27F3G41");
        numberField.validate();
        System.out.println(numberField.getIsValid());

        PhoneField phoneField = new PhoneField("(123) 456-7890", new PhoneBehavior());
        phoneField.validate();
        System.out.println(phoneField.getIsValid());

        phoneField.setValue("(123-12-12331-123)");
        phoneField.validate();
        System.out.println(phoneField.getIsValid());
    }
}
