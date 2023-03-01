package creationalDesignPatterns.prototypePattern;

public abstract class Shape implements Cloneable {
    protected String type;
    private int id;

    abstract void draw();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
