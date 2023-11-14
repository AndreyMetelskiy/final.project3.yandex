import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import yandex.practice3.Feline;

import java.util.List;

@RunWith(Parameterized.class)

public class FelineParameterizedTest {
    private final String animalKind;
    private final List<String> foodForAnimals;

    public FelineParameterizedTest(String animalKind, List<String> foodForAnimals) {
        this.animalKind = animalKind;
        this.foodForAnimals = foodForAnimals;
    }

    @Parameterized.Parameters
    public static Object[][] getFood() {
        return new Object[][]{
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Травощник", List.of()}
        };
    }

    @Test
    public void methodGetFoodParametrsTest() {
        Feline feline = new Feline();
        try {
            Assert.assertEquals(feline.getFood(animalKind), foodForAnimals);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

