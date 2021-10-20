package UsingInterfaceVarsApplication;

class Bravo implements Base {

    // цілочислове поле
    int number;

    // конструктор
    Bravo(int n) {
        number = n;
    }

    // описання методу з інтерфейсу
    @Override
    public void show() {
        System.out.println("Об’єкт класу Bravo");
        System.out.println("Цілочислове поле: " + number);
    }
}
