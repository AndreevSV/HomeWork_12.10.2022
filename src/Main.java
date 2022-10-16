import java.util.Arrays;


public class Main {
    static int[] arr = generateRandomArray();

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr)); // вызывается метод generateRandomArray для создания массива arr

        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int sum = 0; // начальная сумма значений массива
        for (int i : arr) {
            sum += i; // Проходится массив и складывается каждое значение для последующего вывода суммы
        }
        System.out.printf("Сумма затрат за %d дней составит %d \n", arr.length, sum); // Вывод на печать суммы всех значений массива
    }

    public static void task2() {
        int min = arr[0]; // инициализация переменной минимального значения для начала сравнения
        int max = arr[0]; // инициализация переменной максимального значения для начала сравнения
        for (int i : arr) { // Проходится весь массив
            if (i < min) {
                min = i; // Находится минимальное значение
            } if (i > max) {
                max = i; // Находится максимальное значение
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d \n", min); // Вывод на печать минимального значения в массиве
        System.out.printf("Максимальная сумма трат за день составила %d \n", max); // Вывод на печать максимального значения в массиве
    }

    public static void task3() {
        int sum = 0;
        float average;
        for (int i : arr) {
            sum += i;
        }
            average = sum / arr.length;
            System.out.printf("Среднедневная сумма трат составила %.0f \n", average);
        }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(reverseFullName);
        for(int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}