package solidempty.dip.exercise.encodingmodule.refactored;

import solidempty.dip.exercise.encodingmodule.dirty.MyDatabase;

public class DatabaseWriter implements Writer{

    private MyDatabase myDatabase;

    public DatabaseWriter(MyDatabase myDatabase) {
        this.myDatabase = myDatabase;
    }

    @Override
    public void write(String text) {
        myDatabase.write(text);
    }
}
