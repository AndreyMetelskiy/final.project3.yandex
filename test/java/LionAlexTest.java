import yandex.practice3.LionAlex;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionAlexTest {
    @Test
    public void getFriendsTest() throws Exception {
        LionAlex lionAlex = new LionAlex("Самец");
        Assert.assertEquals(lionAlex.getFriends(), List.of("Марти","Глория","Мелман"));
    }
    @Test
    public void getPlaceOfLivingTest() throws Exception {
        LionAlex lionAlex = new LionAlex("Самец");
        Assert.assertEquals(lionAlex.getPlaceOfLiving(), "Нью-Йоркский зоопарк");
    }
    @Test
    public void getKittensTest() throws Exception {
        LionAlex lionAlex = new LionAlex("Самец");
        Assert.assertEquals(lionAlex.getKittens(0),0);
    }

}

