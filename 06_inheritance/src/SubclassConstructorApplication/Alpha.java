package SubclassConstructorApplication;

class Alpha {
    String name;
    int code;

    //конструктор з двома аргументами
    Alpha(String name, int code) {
        this.name = name;
        this.code = code;
        System.out.println("Клас Alpha");
        System.out.println("Поле name - " + this.name);
        System.out.println("Поле code - " + this.code);
    }

    //конструктор з одним текстовим аргументом
    Alpha(String name) {
        this(name, 0);
    }

    //конструктор з одним цілочисловим аргументом
    Alpha(int code) {
        this("Білий", code);
    }

    //конструктор без аргументів
    Alpha() {
        this("Жовтий", 1);
    }
}
