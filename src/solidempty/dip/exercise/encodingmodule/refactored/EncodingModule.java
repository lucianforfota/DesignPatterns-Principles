package solidempty.dip.exercise.encodingmodule.refactored;

import java.io.*;
import java.util.Base64;

public class EncodingModule {

    private Writer writer;
    private Reader reader;

    public EncodingModule(Writer writer, Reader reader) {
        this.writer = writer;
        this.reader = reader;
    }

    public void encode() throws IOException {
        String stringFromFile = reader.read();
        String encodedString = Base64.getEncoder().encodeToString(stringFromFile.getBytes());
        writer.write(encodedString);
    }

}
