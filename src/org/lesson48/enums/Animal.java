package org.lesson48.enums;

//По конвенции все енамы принято писать в единственном числе, а объекты внутри них БОЛЬШИМИ буквами
public enum Animal {
    //Перечислим всех животных
    //конструктор назначает аргумент translation ("собака", "кошка", "лягушка") каждому объекту enum Animal (CAT, DOG, FROG)
    DOG("собака"), CAT("кошка"), FROG("лягушка"); // тоже что в классах new DOG("собака"), new CAT("кошка"), new FROG("лягушка");

    //поле translation назначается при помощи конструктора Animal
    private String translation;

    //конструктор класса Animal
    //конструктор назначает аргумент translation каждому объекту enum Animal (CAT, DOG, FROG)
    Animal(String translation) {
        this.translation = translation;
    }

    //Getter
    public String getTranslation() {
        return translation;
    }

    //преопределим метод toString()
    @Override
    public String toString() {
        return "Перевод на русский язык = " + translation;
    }
}
