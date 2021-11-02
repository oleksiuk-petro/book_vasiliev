package MoreGenInterfaceApplication;

// створення другого класу на основі
// узагальненого інтерфейсу
class Bravo implements MyMethods<Character> {

    private Character value;

    public Bravo(Character arg) {
        value = arg;
    }

    // описання методів з інтерфейсу
    @Override
    public Character get() {
        return value;
    }

    @Override
    public void set(Character arg) {
        value = arg;
    }

    void show() {
        System.out.println("Символьне поле: " + get());
    }
}
