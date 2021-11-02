package UsingStaticGenMethodApplication;

// клас зі статичними узагальненими методами
class UsingStaticGenMethodApplication {

    // метод з аргументом узагальненого типу
    static <X> void show(X arg) {
        System.out.println(arg);
    }

    // аргумент методу - узагальнений масив
    static <X> void show(X[] array) {
        System.out.print("| ");
        // відображення значень елементів масиву
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " | ");
        }
        System.out.println("");
    }

    // методу аргументом передається узагальнений масив
    // і цілочисловий індекс, а результатом повертається
    // значення елемента з відповідним індексом
    static <X> X getElement(X[] array, int index) {
        return array[index];
    }

    // головний метод
    public static void main(String[] args) {
        // цілочисловий масив
        Integer[] nums = {1, 3, 7, 2};
        // символьний масив
        Character[] symbs = {'A','W','L','O','B'};
        System.out.println("Виклик методу show()");
        System.out.print("З текстовим аргументом: ");
        show("узагальнений метод");
        System.out.print("З int-аргументом: ");
        show(123);
        System.out.print("З double-аргументом: ");
        show(123.45);
        System.out.print("З char-аргументом: ");
        show('A');
        System.out.print("Цілочисловий масив: ");
        show(nums);
        System.out.print("Символьний масив: ");
        show(symbs);
        // відображення елементів масивів
        System.out.println("Виклик методу getElement()");
        System.out.print("Цілочисловий масив: * ");
        for (int k = 0; k < nums.length; k++) {
            System.out.print(getElement(nums, k) + " * ");
        }
        System.out.print("\nСимвольний масив: * ");
        for (int k = 0; k < symbs.length; k++) {
            System.out.print(getElement(symbs, k) + " * ");
        }
        System.out.println("");
    }
}
