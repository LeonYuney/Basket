public class Basket {
    // Переменные класса
    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private double totalWeight = 0; // Новая переменная для хранения общей массы
    private int limit;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count += count;
    }

    // Метод добавления товара с параметрами имени и цены
    public void add(String name, int price) {
        add(name, price, 1);
    }

    // Метод добавления товара с параметрами имени, цены и количества
    public void add(String name, int price, int count) {
        boolean error = false;

        if (contains(name)) {
            error = true; // Товар уже существует в корзине
        }

        if (totalPrice + count * price >= limit) {
            error = true; // Превышен лимит по цене
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items += "\n" + name + " - " + count + " шт. - " + price;
        totalPrice += count * price;
    }

    // Новый метод добавления товара с учетом веса
    public void add(String name, int price, int count, double weight) {
        add(name, price, count); // Переиспользуем существующий метод add()

        if (count > 0 && weight > 0) { // Проверяем корректность переданных значений
            totalWeight += count * weight; // Добавляем вес к общей массе
        }
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0; // Сбрасываем общую массу при очистке корзины
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight; // Возвращаем общую массу товаров в корзине
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
            System.out.println("Общая масса: " + totalWeight + " кг"); // Выводим общую массу
            System.out.println("Общая стоимость: " + totalPrice + " руб"); // Выводим общую стоимость
        }
    }
}