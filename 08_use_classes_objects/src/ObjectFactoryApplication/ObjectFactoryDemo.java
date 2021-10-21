package ObjectFactoryApplication;

class ObjectFactoryDemo {

    // статичний метод для створення об’єктів різних класів
    static Base createObject(int n) {
        if (n == 1) {
            return new Alpha();
        } else if (n == 2) {
            return new Bravo();
        } else {
            return new Charlie();
        }
    }

    public static void main(String[] args) {
        // об’єктна змінна абстрактного суперкласу
        Base obj;

        for (int k = 1; k <= 3; k++) {
            obj = createObject(k);
            obj.show();
        }
    }
}
