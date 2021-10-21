package CopyConstructorApplication;

class MyClass extends Base {

    int code;

    MyClass(String txt, int n) {
        super(txt);
        code = n;
    }

    // конструктор створення копії
    MyClass(MyClass obj) {
        super(obj);
        code = obj.code;
    }

    void show() {
        System.out.println("Текстове поле: " + name);
        System.out.println("Цілочислове поле: " + code);
    }
}
