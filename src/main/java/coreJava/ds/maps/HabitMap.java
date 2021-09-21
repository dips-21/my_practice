package coreJava.ds.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HabitMap {
    String[] person = {"dips", "dips", "john", "don", "ron"};
    String[] habit = {"eat", "movie", "movie", "movie", "drink"};
    String[] description = {"dark choc", "horror", "funny", "action", "milk"};
    Map<PersonHabit, String> habitMap;

    HabitMap() {
        habitMap = new HashMap<>();
        //PersonHabit personHabit=new PersonHabit("dips","eat");
        //habitMap.put(personHabit,"dark choc");
        for (int i = 0; i < person.length; i++) {
            PersonHabit personHabit = new PersonHabit(person[i], habit[i]);
            habitMap.put(personHabit, description[i]);
        }
    }

    String get(String personName, String habit) {
        System.out.println("map=====" + habitMap);
        String desc = habitMap.get(new PersonHabit(personName, habit));
        if (desc == null) {
            return "not found";
        }
        return desc;
    }
}

class PersonHabit {
    String personName;
    String habit;

    public PersonHabit(String personName, String habit) {
        this.personName = personName;
        this.habit = habit;
    }

    public String getPersonName() {
        return personName;
    }

    public String getHabit() {
        return habit;
    }

    public void setPersonName(String name) {
        this.personName = name;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }

    @Override
    public String toString() {
        return "PersonHabit{" +
                "personName='" + personName + '\'' +
                ", habit='" + habit + '\'' +
                '}';
    }
/*
    @Override
    public boolean equals(Object o) {
        return true;
    }*/

   /* @Override
    public int hashCode() {
        int h = 0;
        h = 31 * h + personName.hashCode();
        h = 31 * h + habit.hashCode();
        return h;
    }

    int hash(char[] arr) {
        int h = 0;
        for (int i = 0; i < arr.length; i++) {
            h = 31 * h + arr[i];
        }
        return h;
    }*/

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if(other==null)
            return false;
        //if (other == null || PersonHabit.class != other.getClass()) return false;
        if (PersonHabit.class != other.getClass())
            return false;
        PersonHabit that = (PersonHabit) other;
        return getPersonName().equals(that.getPersonName()) && getHabit().equals(that.getHabit());
    } //o instanceof(person habit)

    @Override
    public int hashCode() {
        return Objects.hash(getPersonName(), getHabit());
    }
}
