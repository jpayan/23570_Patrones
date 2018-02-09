package Fields;

import Behaviors.Validatable;

public abstract class Field {
    private String value;
    private boolean isValid;
    private Validatable validationBehavior;

    public Field(String value, Validatable validationBehavior) {
        this.value = value;
        this.validationBehavior = validationBehavior;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean getIsValid() {
        return this.isValid;
    }

    public void setValidatable(Validatable validationBehavior) {
        this.validationBehavior = validationBehavior;
    }

    public void validate() {
        this.isValid = this.validationBehavior.validate(this.value);
    }
}
