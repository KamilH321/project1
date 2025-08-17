package ru.itis.shop.console;

import ru.itis.shop.product.console.ProductConsole;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner;
    private final ProductConsole productConsole;

    public Menu(ProductConsole productConsole) {
        this.scanner = new Scanner(System.in);
        this.productConsole = productConsole;
    }

    public void run() {
        while (true) {

            String command = this.scanner.nextLine();

            switch (command) {
                case "1":
                    break;
                case "2":
                    System.exit(0);
            }
        }
    }

    private void showMenu() {
        System.out.println("1.Посмотреть товары");
        System.out.println("2.Выйти");
    }
}
