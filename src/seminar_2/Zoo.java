package seminar_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>(Arrays.asList(new Fish("nemo","cloun", "red-white", 0,1), new Cat("barsik", "vislauh", "black", 4, 6)
                , new Dog("sedi", "ratvailer", "brown", 4, 2), new Duck("kru", "rat", "white", 2, 1)));
    }

    public void talk() {
        for (SpeakAble animal: getSpeakAble()) {
            System.out.printf("%s\n", animal.speak());
        }
    }

    public List<SpeakAble> getSpeakAble(){
        List<SpeakAble> result = new ArrayList<>();
        for (Animal speakItem:animals) {
            if (speakItem instanceof SpeakAble){
                result.add((SpeakAble) speakItem);
            }
        }
//        result.add(new Radio());
        return result;
    }

    public void run() {
        for (RunAble animal :getRunAble()) {
            System.out.printf("%s,%s\n",animal.toString(),animal.run());
        }
    }

    public List<RunAble> getRunAble(){
        List<RunAble> result = new ArrayList<>();
        for (Animal speakItem:animals) {
            if (speakItem instanceof RunAble){
                result.add((RunAble) speakItem);
            }
        }
        return result;
    }

    public void fly() {
        for (FlyAble animal :getFlyAble()) {
            System.out.printf("%s,%s\n",animal.toString(),animal.fly());
        }
    }

    public List<FlyAble> getFlyAble(){
        List<FlyAble> result = new ArrayList<>();
        for (Animal speakItem:animals) {
            if (speakItem instanceof FlyAble){
                result.add((FlyAble) speakItem);
            }
        }
        return result;
    }
}
