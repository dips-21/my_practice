package operator;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable /*implements Comparable<Person>*/{
 int id;
 int weight;

 @Override
 public String toString() {
  return "Person{" +
          "id=" + id +
          ", weight=" + weight +
          ", height=" + height +
          ", name='" + name + '\'' +
          '}';
 }

 double height;
 String name;

 public Person(int id, int weight, double height, String name) {
  this.id = id;
  this.weight = weight;
  this.height = height;
  this.name = name;
 }
 public int getId() {
  return id;
 }

 public int getWeight() {
  return weight;
 }

 public double getHeight() {
  return height;
 }

 public String getName() {
  return name;
 }

 /*@Override
 public int compareTo(Person o) {
  return this.name.compareTo(o.name);
 }*/


 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (o == null || getClass() != o.getClass()) return false;
  Person person = (Person) o;
  return id == person.id && weight == person.weight && Double.compare(person.height, height) == 0 && name.equals(person.name);
 }

 @Override
 public int hashCode() {
  return Objects.hash(id, weight, height, name);
 }
}
