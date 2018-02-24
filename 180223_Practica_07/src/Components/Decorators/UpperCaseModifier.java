package Components.Decorators;

import Components.InputReader;

public class UpperCaseModifier extends Modifier {
    public UpperCaseModifier(InputReader inputReader) {
        this.inputReader = inputReader;
    }

    @Override
    public Object modify() {
        return inputReader.getValue().toString().toUpperCase();
    }

    @Override
    public Object getValue() {
        return this.inputReader.getValue();
    }

    @Override
    public void setValue(Object value) {
        this.inputReader.setValue(value);
    }
}
