package CopyConstructorApplication;

class Base {

    String name;

    Base(String txt) {
        name = txt;
    }

    // конструктор створення копії
    Base(Base obj) {
        name = obj.name;
    }
}
