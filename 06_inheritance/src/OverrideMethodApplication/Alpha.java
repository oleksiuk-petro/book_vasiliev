package OverrideMethodApplication;

class Alpha {
    //текстове поле
    String name;

    //метод для відображення текстового поля
    void show() {
        System.out.println("Об’єкт класу Alpha");
        System.out.println("Поле name - " + name);
    }

    //конструктор класу
    Alpha(String name) {
        this.name = name;
    }
}
