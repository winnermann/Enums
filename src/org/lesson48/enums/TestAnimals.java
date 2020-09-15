package org.lesson48.enums;

public class TestAnimals {
    public static void main(String[] args) {
        //К переменной CAT мы получаем доступ через enum (Animal.CAT)
        Animal animal = Animal.CAT;

        //выводит значение поля private String translation;
        System.out.println(animal.getTranslation());

        //Выводит объект CAT енама Animal, если метод toString() не переопределен
        System.out.println(animal.toString());


        switch (animal){
            case CAT:
                System.out.println("It's a CAT");
                break;
            case DOG:
                System.out.println("It's a DOG");
                break;
            case FROG:
                System.out.println("It's a FROG");
                break;
                //При использовании enum не требуется default:, т.к. перечисления ограничены определенным списком
            // животных. Выбрать несуществующее животное нельзя.
/*            default:
                System.out.println("It's not an animal");*/
        }
    }
}
