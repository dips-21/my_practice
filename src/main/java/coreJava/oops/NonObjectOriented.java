package coreJava.oops;

public class NonObjectOriented {
   private int max = 10;
    private String[] name = new String[max];
    private int[] age = new int[max];
    private String[] habit = new String[max];
    private int position = -1;

    // 1 age negative ,data consistent
    void example1() {
        name[0] = "dips";
        age[0] = 24;
        habit[0] = "phone";

        name[1] = "sil";
        age[0] = 25;
        habit[1] = "dancing";
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals("dips")) {

            }
        }
    }      //private fields public method--->encapsulation

    // 2
    //pos 1
    //[sona] null null
    //mona null null
    void addPerson(String name, String habit, int age) {
        position++;
        //age <18 drinking
        if (age < 18 && habit.equals("drinking")) {
            throw new IllegalArgumentException("under 18 not allowed to drink");
        }
        this.name[position] = name;
        this.habit[position] = habit;
        this.age[position] = age;


    }

    String getPersonHobby(String name) {
        for (int i = 0; i <= position; i++) {
            if (this.name[i].equals(name))
                return this.habit[i];
        }
        return null;
    }
}

//3
//Person PersonWithFriend PersonWithGroup

