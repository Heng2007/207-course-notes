package midterm_1;

public class Generics <T extends Object>{
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}
