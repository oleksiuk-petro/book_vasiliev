package AnonymousClassApplication;

// абстрактний суперклас
abstract class Base {

    // закрите текстове поле
    private String name;

    // контруктор абстрактного класу
    Base(String txt) {
        name = txt;
    }

    // метод відображає значення текстового поля
    void show() {
        System.out.println("Ім’я об’єкта: " + name);
    }

    // оголошення абстрактного методу
    abstract void hello();
}
