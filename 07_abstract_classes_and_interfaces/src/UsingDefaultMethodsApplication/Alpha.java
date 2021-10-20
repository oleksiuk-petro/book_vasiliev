package UsingDefaultMethodsApplication;

class Alpha implements Base {

    // описання звичайного методу
    @Override
    public void hello() {
        System.out.println("Об’єкт класу Alpha");
    }

    // описання методу з кодом за замовчуванням
    @Override
    public void show(String txt) {
        System.out.println("Клас Alpha: " + txt);
    }
}
