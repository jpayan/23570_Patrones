package Components;

public class StringReader extends InputReader {
    public StringReader(String value) {
        this.value = value;
    }

    @Override
    public Object getValue() {
        return this.value.toString();
    }

    @Override
    public void setValue(Object value) {
        this.value = value.toString();
    }
}
