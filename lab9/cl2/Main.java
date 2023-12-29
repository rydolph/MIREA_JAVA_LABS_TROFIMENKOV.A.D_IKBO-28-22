package ru.mirea.lab9.cl2;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса Product
        Product product = new Product("Книга", 10.99);

        // Вызываем метод getPrice() через интерфейсный тип
        double price = product.getPrice();

        // Выводим результат
        System.out.println("Цена продукта \"" + product.getName() + "\": $" + price);
    }
}
