import yandex.practice3.Cat;
import yandex.practice3.Feline;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void methodGetSoundTest() {
        Cat cat = new Cat();
        Assert.assertEquals(cat.getSound(), "Мяу");
    }

    @Test
    public void testCatConstructor() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        // Проверяем, что поле predator объекта Cat имеет то же значение, что и объект Feline
        Assert.assertEquals(feline, cat.predator);
    }

    @Test
    public void testCatMethods() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        // Проверяем, что метод getFood объекта Cat возвращает список мясных продуктов
        try {
            Assert.assertEquals(feline.eatMeat(), cat.getFood());
        } catch (Exception e) { // Обрабатываем исключение, если оно возникло
            e.printStackTrace();
        }
    }
}




