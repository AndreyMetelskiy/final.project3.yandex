import yandex.practice3.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Test
    public void methodLionTestTrue() throws Exception {
        Lion lion = new Lion("Самец");
        Assert.assertEquals(lion.doesHaveMane(), true);
    }

    @Test
    public void methodLionTestFalse() throws Exception {
        Lion lion = new Lion("Самка");
        Assert.assertEquals(lion.doesHaveMane(), false);
    }

    @Test(expected = Exception.class)
    public void methodLionTestException() throws Exception {
        Lion lion = new Lion("Самцка");
        Assert.assertEquals(lion.doesHaveMane(), Exception.class);
    }

    @Test
    public void methodLionGetKittens() throws Exception {
        Lion lion = new Lion("Самец");
        Assert.assertEquals(lion.getKittens(1), 1);
    }

    @Test
    public void methodLionGetFoodsPredatorTest() throws Exception {
        Lion lion = new Lion("Самец");
        Assert.assertEquals(lion.getFood("Хищник"), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void methodLionGetFoodsHerbivoreTest() throws Exception {
        Lion lion = new Lion("Самец");
        Assert.assertEquals(lion.getFood("Травоядное"), List.of("Трава", "Различные растения"));
    }

    @Test(expected = Exception.class)
    public void methodLionGetFoodsExceptionTest() throws Exception {
        Lion lion = new Lion("Самец");
        Assert.assertEquals(lion.getFood("Травоящное"), Exception.class);
    }
    @Mock
    Lion lion;

    @Test
    public void mockGetFoodsPredatorAnimalTest() throws Exception {
        lion.getFood("Хищник");
        Mockito.verify(lion).getFood("Хищник");
    }
    @Test
    public void mockGetFoodsHerbivoreAnimalTest() throws Exception {
        lion.getFood("Травоядное");
        Mockito.verify(lion).getFood("Травоядное");

    }

}



