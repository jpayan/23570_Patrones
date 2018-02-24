import Components.Decorators.UpperCaseModifier;
import Components.InputReader;
import Components.StringReader;
import JavaImplementation.Decorators.UpperCaseFilter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        InputReader stringReader = new StringReader("test value");
        System.out.println(stringReader.getValue());

        UpperCaseModifier stringReaderUpperCase = new UpperCaseModifier(stringReader);
        System.out.println(stringReaderUpperCase.modify());

        // JAVA IMPLEMENTATION
        InputStream fileInputStream = new FileInputStream("src/test_file.txt");
        UpperCaseFilter streamUpperCase = new UpperCaseFilter(fileInputStream);
        System.out.println(streamUpperCase.streamToUpperCase());
        streamUpperCase.close();
    }
}
