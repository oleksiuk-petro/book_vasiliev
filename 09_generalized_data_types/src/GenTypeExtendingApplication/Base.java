package GenTypeExtendingApplication;

// суперклас
class Base {

    // текстове поле
    String name;

    // конструктор
    Base(String txt) {
        name = txt;
    }

    // метод для відображення значення текстового поля
    void show() {
        System.out.println("Текстове поле: " + name);
    }
}