package org.lesson48.enums;

public class TestSeasonsAnimals {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        //метод .name() возвращает название Енама в виде строки
        System.out.println(season.name());

        Animal animal = Animal.CAT;
        //метод .name() возвращает название Енама в виде строки не смотря на то, что метод toString() переопределен
        System.out.println(animal.name());

        //возвращает значение Енама FROG
        Animal frog = Animal.valueOf("FROG");
        //выводит значение Енама FROG
        System.out.println(frog.getTranslation());

        //Выводит индекс объекта Енама WINTER
        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());
    }
}
