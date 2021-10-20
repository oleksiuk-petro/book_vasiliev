package UsingInterfaceVarsApplication;

class Alpha implements Base{

    // текстове поле
    String word;

    // конструктор
    Alpha(String txt) {
        word = txt;
    }

    // описання методу з інтерфейсу
    @Override
    public void show() {
        System.out.println("Об’єкт класу Alpha");
        System.out.println("Текстове поле: " + word);
    }
}
