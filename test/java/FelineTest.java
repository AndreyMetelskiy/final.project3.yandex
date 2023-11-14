import org.junit.Assert;
import org.junit.Test;
import yandex.practice3.Feline;

import java.util.List;

public class FelineTest {
    @Test
    public void methodEatMeatTest() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(feline.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void methodGetFamilyTest() {
        Feline feline = new Feline();
        Assert.assertEquals(feline.getFamily(), "Кошачьи");
    }

    @Test
    public void methodGetKittensTest() {
        Feline feline = new Feline();
        Assert.assertEquals(feline.getKittens(1), 1);
    }
}
