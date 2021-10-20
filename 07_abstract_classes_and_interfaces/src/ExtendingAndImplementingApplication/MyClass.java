package ExtendingAndImplementingApplication;

class MyClass extends Base implements First, Second {

    @Override
    public String getFirst() {
        return "Інтерфейс First";
    }

    @Override
    public String getSecond() {
        return "Інтерфейс Second";
    }

    @Override
    public void show() {
        System.out.println("Ми використовуємо:");
        System.out.println(getFirst());
        System.out.println(getSecond());
        System.out.println(getBase());
        First.super.show();
        Second.super.show();
        super.show();
    }
}
