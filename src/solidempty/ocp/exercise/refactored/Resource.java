package solidempty.ocp.exercise.refactored;

public abstract class Resource {

    public abstract int findFree ();

    public abstract void markBusy(int resourceId);
    public abstract void markFree(int resourceId);


}
