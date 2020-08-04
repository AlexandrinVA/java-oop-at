package homework;

import org.junit.jupiter.api.Test;

import java.util.*;

public class FirstTask {

    @Test
    public void firstTask(){
        String text = "капитан капитан улыбнитесь ведь улыбка это флаг корабля капитан капитан подтянитесь только смелым покоряются моря";
        String[] array = text.split(" ");
        List<String> list = Arrays.asList(array);
        Set<String> set = new HashSet<>(list);

        for(String word : set){
            System.out.println("Слово '" + word + "' встречается " + Collections.frequency(list,  word) + " раз(а).");
        }
    }
}
