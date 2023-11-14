package yandex.practice3;

import java.util.List;

public class Cat {

    public Predator predator;

    public Cat(Feline feline) {
        this.predator =feline;
    }

    public Cat() {
    }
    public String getSound() {
        return "Мяу";
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }

}
