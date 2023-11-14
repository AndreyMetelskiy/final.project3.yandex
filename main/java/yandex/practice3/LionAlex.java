package yandex.practice3;

import java.util.List;

public class LionAlex extends Lion{

    Lion lion= new Lion("Самец");

    public LionAlex(String sex) throws Exception {
        super(sex);
    }
    public List<String>  getFriends(){
        return List.of("Марти","Глория","Мелман");
    }
    public String getPlaceOfLiving(){
        String place = "Нью-Йоркский зоопарк";
        return place;
    }
    @Override
    public int getKittens(int kittensCount) {
        kittensCount = 0;
        return kittensCount;
    }


}
