package section10;

public abstract class section10ClassB {
    public String getSimpleClassName() {
        return this.getClass().getSimpleName();
    }

    protected String protStr = "yes this is abstract, and protected";
}
