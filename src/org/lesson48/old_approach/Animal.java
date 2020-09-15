package org.lesson48.old_approach;

public class Animal {
    public static final int DOG = 0;
    public static final int CAT = 1;
    public static final int FROG = 2;

    public static void main(String[] args) {
        int animal = 100;
        switch (animal){
            case DOG:
                System.out.println("It's a DOG");
                break;
            case CAT:
                System.out.println("It's a CAT");
                break;
            case FROG:
                System.out.println("It's a FROG");
                break;
            default:
                System.out.println("It's not an animal");
                break;
        }
    }
}
