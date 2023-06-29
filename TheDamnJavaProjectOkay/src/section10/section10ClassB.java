package section10;

public abstract class section10ClassB {
    public String getSimpleClassName() {
        return this.getClass().getSimpleName();
    }

    protected String abstractString() {
        return "yes this is abstract";
    }
}
