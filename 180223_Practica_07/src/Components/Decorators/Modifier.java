package Components.Decorators;

import Components.InputReader;

public abstract class Modifier extends InputReader {
    protected InputReader inputReader;
    public abstract Object modify();
}