package UsingGenMethodsApplication;

// клас з узагальненим методом
class MyClass {

    // текстове поле
    String name;

    // узагальнений метод
    <X> void show(X arg) {
        System.out.println(name + ": " + arg);
    }

    // конструктор
    public MyClass(String txt) {
        name = txt;
    }
}
