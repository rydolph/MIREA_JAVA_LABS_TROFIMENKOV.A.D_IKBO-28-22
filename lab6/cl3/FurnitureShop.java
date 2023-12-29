package ru.mirea.lab6.cl3;

import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {
    private List<Furniture> furnitureList;

    public FurnitureShop() {
        furnitureList = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public void showAllFurniture() {
        for (Furniture furniture : furnitureList) {
            furniture.info();
        }
    }

    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Chair chair = new Chair("Wooden chair", 50);
        Table table = new Table("Round table", 100);
        Sofa sofa = new Sofa("Leather sofa", 300);

        shop.addFurniture(chair);
        shop.addFurniture(table);
        shop.addFurniture(sofa);

        shop.showAllFurniture();
    }
}
