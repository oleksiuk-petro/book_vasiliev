package MoreGenInterfaceApplication;

// створення першого класу на основі
// узагальненого інтерфейсу
class Alpha implements MyMethods<Integer> {

    private Integer value;

    public Alpha(Integer arg) {
        value = arg;
    }

    // описання методів з інтерфейсу
    @Override
    public Integer get() {
        return value;
    }

    @Override
    public void set(Integer arg) {
        value = arg;
    }

    void show() {
        System.out.println("Цілочислове поле: " + get());
    }
}
