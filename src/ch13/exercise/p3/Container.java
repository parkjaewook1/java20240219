package ch13.exercise.p3;

public class Container<T, U> {


    public T Key;
    public U Value;

    public T getKey() {
        return Key;
    }

    public U getValue() {
        return Value;
    }

    public void setKey(T key) {
        this.Key = key;
    }

    public void setValue(U value) {
        this.Value = value;
    }


    public void set(T key, U value) {
    }
}
