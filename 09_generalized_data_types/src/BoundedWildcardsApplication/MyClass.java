package BoundedWildcardsApplication;

class MyClass<T> {

    private T obj;

    MyClass(T arg) {
        obj = arg;
    }

    @Override
    public String toString() {
        return obj.toString();
    }
}