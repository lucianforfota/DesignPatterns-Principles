package solidempty.dip.exercise.encodingmodule.dirty;

import java.io.*;
import java.util.Base64;

public class EncodingModule {


    public void encodeFromFileToFile() throws IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {

            reader = new BufferedReader(new FileReader("src/main/java/solid/dip/exercise/encodingmodule/dirty/fileToBeEncrypted.txt"));
            writer = new BufferedWriter(
                    new FileWriter("fileEncrypted.txt"));

            while (reader.readLine() != null) {
                String encodedLine = Base64.getEncoder().encodeToString(reader.readLine().getBytes());
                writer.append(encodedLine);
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
    }

    public void encodeFromFileToDatabase() throws IOException {
        BufferedReader reader = null;
        StringBuilder inputString1 = new StringBuilder();
        try {
            reader = new BufferedReader(
                    new FileReader("src/main/java/solid/dip/exercise/encodingmodule/dirty/fileToBeEncrypted.txt"));
            while (reader.readLine() != null) {
                inputString1.append(reader.readLine());
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        String inputString = inputString1.toString();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
        System.out.println(database);
    }
}
