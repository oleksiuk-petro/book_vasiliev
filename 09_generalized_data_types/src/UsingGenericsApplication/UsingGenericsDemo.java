package UsingGenericsApplication;

// головний клас
class UsingGenericsDemo {
    public static void main(String[] args) {

        // створення об’єктів на основі узагальненого класу
        Bravo<Integer, Character> objA = new Bravo<Integer, Character>(100, 'A');
        Bravo<String, Double> objB = new Bravo<String, Double>("BRAVO", 12.345);

        // відображення значення полів об’єктів
        objA.show();
        objB.show();
    }
}
