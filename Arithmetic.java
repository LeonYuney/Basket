public class Arithmetic {
    // Переменные класса для хранения двух чисел
    private int number1;
    private int number2;

    // Конструктор, принимающий два параметра
    public Arithmetic(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Метод для вычисления суммы
    public int sum() {
        return number1 + number2;
    }

    // Метод для вычисления произведения
    public int product() {
        return number1 * number2;
    }

    // Метод для нахождения максимального числа
    public int max() {
        return Math.max(number1, number2);
    }

    // Метод для нахождения минимального числа
    public int min() {
        return Math.min(number1, number2);
    }

    // Основной метод для тестирования класса
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(10, 20);

        System.out.println("Сумма: " + arithmetic.sum());
        System.out.println("Произведение: " + arithmetic.product());
        System.out.println("Максимальное число: " + arithmetic.max());
        System.out.println("Минимальное число: " + arithmetic.min());
    }
}