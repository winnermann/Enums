package org.lesson48.enums;

//Иерархия наследования Енама enum Season
// class Object -> class Enum -> enum Season
public enum Season {
    //Объекты Енама Season (SUMMER, WINTER, AUTUMN, SPRING)
    SUMMER(35), WINTER(-30), AUTUMN(10), SPRING(20);

    private int temperature;

    //Конструктор енама Season
    //Конструктор задает значения температуры объектам SUMMER(35), WINTER(-30), AUTUMN(10), SPRING(20);
    Season(int temperature) {
        this.temperature = temperature;
    }

    //Getter, который возвращает температуру
    public int getTemperature() {
        return temperature;
    }
}
