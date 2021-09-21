package coreJava.ds.maps;

import java.util.HashMap;
import java.util.Map;

public class HabitMapping {
   // Map<PersonHabit,string>
    Map<String, Map<String, String>> habbitMapping;
    //Map<String, String> methodTypeToFunction;
    String[] person = {"dips", "dips", "john", "don", "ron"};
    String[] habit = {"eat", "movie", "movie", "movie", "drink"};
    String[] description = {"dark choc", "horror", "funny", "action", "milk"};


    HabitMapping() {
        habbitMapping = new HashMap<>();
        for (int i = 0; i < person.length; i++) {
            habbitMapping.putIfAbsent(person[i], new HashMap<>());
            Map<String, String> personHabit = habbitMapping.get(person[i]);  //person,habit
            personHabit.put(habit[i], description[i]);
        }
    }

    //(dips,eat) -> bread (dips,sleep)->likes ,(dipali,drink)->water

    String getHabitMapping(String person, String habit) {
        Map<String, String> habitMap = habbitMapping.get(person);
        if (habitMap == null)
            return "404";

        String desc = habitMap.get(habit);
        if (desc == null)
            return "405";

        return desc;

    }

}
