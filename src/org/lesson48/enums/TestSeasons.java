package org.lesson48.enums;

public class TestSeasons {
    public static void main(String[] args) {
        //Иерархия наследования Енама enum Season
        // class Object -> class Enum -> enum Season
        Season season = Season.WINTER;
        System.out.println(season.getTemperature());

        //Выводит объект WINTER енама Season, если метод toString() не переопределен
        System.out.println(season.toString());

        //instanceof проверяет является ли объект season объектом класса Season
        //instanceof проверяет был ли объект .WINTER создан от объекта класса Season
        //instanceof проверяет что WINTER является объектом класса Season
        System.out.println(season instanceof Season);

        //instanceof проверяет что WINTER является объектом класса Enum
        System.out.println(season instanceof Enum);

        //instanceof проверяет что WINTER является объектом класса Object
        System.out.println(season instanceof Object);

        //Получаем класс, объектом которого season (или WINTER) является
        System.out.println(season.getClass());
        switch (season){
            case SUMMER:
                System.out.println("It's warm outside");
                break;
            case WINTER:
                System.out.println("It's cold outside");
                break;
        }
    }
}
