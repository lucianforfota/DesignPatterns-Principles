package solidempty.dip.exercise.encodingmodule.refactored;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader implements Reader{

    private String fileName;

    public MyFileReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String read() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder lines = new StringBuilder();
        while (reader.readLine() != null) {
            lines.append(reader.readLine());
        }
        reader.close();
        return lines.toString();
    }
}
