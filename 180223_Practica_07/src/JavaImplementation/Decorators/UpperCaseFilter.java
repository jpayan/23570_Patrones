package JavaImplementation.Decorators;

import java.io.*;

public class UpperCaseFilter extends FilterInputStream {
    public UpperCaseFilter(InputStream in) {
        super(in);
    }

    public String streamToUpperCase() throws IOException {
        String result = "";
        int character;
        while((character = read()) > 0) {
            result += Character.toString((char) character);
        }
        return result;
    }

    private int charToUpperCase(int character) {
        return Character.toUpperCase((char) character);
    }

    @Override
    public int read() throws IOException {
        int character;
        return (character = in.read()) == -1 ? -1 : charToUpperCase(character);
    }

    @Override
    public void close() throws IOException {
        in.close();
    }
}
