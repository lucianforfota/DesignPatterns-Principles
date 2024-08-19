package solidempty.dip.exercise.encodingmodule.refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter implements Writer{

    private String fileName;


    public MyFileWriter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void write(String text) throws IOException {
        BufferedWriter writer = new BufferedWriter(
                    new FileWriter(fileName));
        writer.write(text);
        writer.close();
    }
}
