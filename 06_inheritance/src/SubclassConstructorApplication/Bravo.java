package SubclassConstructorApplication;

class Bravo extends Alpha {
    char symbol;

    //закритий метод
    private void show() {
        System.out.println("Клас Bravo:");
        System.out.println("Поле symbol - " + symbol);
        for(int k = 1; k <= 18; k++) {
            System.out.print("-");
        }
        System.out.println();
    }

    //конструктор з трьома аргументами
    Bravo(String name, int code, char symbol) {
        //виклик конструктора суперкласу
        super(name, code);
        this.symbol = symbol;
        show(); //виклик закритого методу
    }

    //конструктор з одним символьним аргументом
    Bravo(char symbol) {
        super();
        this.symbol = symbol;
        show();
    }

    //конструктор з одним текстовим аргументом
    Bravo(String name) {
        super(name);
        this.symbol = 'A';
        show();
    }

    //конструктор з одним цілочисловим аргументом
    Bravo(int code) {
        super(code);
        this.symbol = 'B';
        show();
    }

    //конструктор без аргументів
    Bravo() {
        this.symbol = 'C';
        show();
    }

    //конструктор з двома аргументами
    Bravo(String name, int code) {
        this(name, code, 'D');
    }
}
