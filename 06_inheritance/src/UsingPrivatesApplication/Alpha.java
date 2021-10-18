package UsingPrivatesApplication;

class Alpha {
    //закрите поле
    private int code;

    //відкритий метод для присвоєння
    //значення закритому полю
    public void set(int code) {
        this.code = code;
    }

    //відкритий метод для відображення
    //значення закритого поля
    public void show() {
        System.out.println("Поле code:" + code);
    }

    //конструктор класу
    public Alpha(int code) {
        set(code);
    }
}
