package sunbeamPractical;

import operator.Person;

import java.util.Objects;

enum GENDER {male, female};

public class Singer implements Comparable<Singer> {
    private String name;
    private int age;
    private GENDER gender;
    private String email_id;
    private int contact_No;
    private int rating;

    public Singer(String name) {
        this.name = name;

    }

    public Singer(String name, int rating) {
        this.name = name;
        this.rating = rating;

    }

    public Singer(String name, int age, GENDER gender, String email_id, int contact_No, int rating) {
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        this.contact_No = contact_No;
        this.rating = rating;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public int getContact_No() {
        return contact_No;
    }

    public void setContact_No(int contact_No) {
        this.contact_No = contact_No;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email_id='" + email_id + '\'' +
                ", contact_No=" + contact_No +
                ", rating=" + rating +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Singer)) return false;
        //if (o == null || getClass() != o.getClass()) return false;
        Singer singer = (Singer) o;
        return age == singer.age && contact_No == singer.contact_No && rating == singer.rating
                && name.equals(singer.name) && Objects.equals(email_id, singer.email_id);    //name
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email_id, contact_No, rating);
    }

    @Override
    public int compareTo(Singer o) {
        return this.name.compareTo(o.name);

    }
}
