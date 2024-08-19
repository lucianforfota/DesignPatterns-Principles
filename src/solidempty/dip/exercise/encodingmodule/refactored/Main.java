package solidempty.dip.exercise.encodingmodule.refactored;

import solidempty.dip.exercise.encodingmodule.dirty.MyDatabase;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule(
                new MyFileWriter("fileEncrypted.txt"),
                new MyFileReader("src/main/java/solid/dip/exercise/encodingmodule/refactored/fileToBeEncrypted.txt")
        );
        encodingModule.encode();
    }
}
