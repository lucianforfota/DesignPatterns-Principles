package solidempty.ocp.exercise.refactored;

public class SpaceResource extends Resource{
    @Override
    public int findFree() {
        return 0;
    }

    @Override
    public void markBusy(int resourceId) {

    }

    @Override
    public void markFree(int resourceId) {

    }
}
