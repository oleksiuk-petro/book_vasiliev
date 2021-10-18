package MoreOverridingApplication;

class Alpha {
    String name;

    void show() {
        System.out.println("Об’єкт " + name);
    }

    Alpha(String name) {
        this.name = name;
    }
}
