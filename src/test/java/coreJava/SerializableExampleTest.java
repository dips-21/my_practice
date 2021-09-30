package coreJava;

import coreJava.interfaces.Mango;
import operator.Person;
import org.junit.Test;

import java.io.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SerializableExampleTest {
    @Test
    public void serialiseAndDeserialize() throws IOException, ClassNotFoundException {
        Person person = new Person(1, 60, 5.6, "dips");
        FileOutputStream f = new FileOutputStream("target/person.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(f);
        objectOutputStream.writeObject(person);
        assertThat(person instanceof Serializable, is(true));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("target/person.dat"));
        Person person1 = (Person) objectInputStream.readObject();
        assertThat(person1, is(person));
        assertThat(person1 == person, is(false));
    }

    @Test(expected = NotSerializableException.class)
    public void serialiseAndDeserializeWithoutSerializable() throws IOException, ClassNotFoundException {
        Mango mango = new Mango("alphonso", true);
        FileOutputStream f = new FileOutputStream("target/mango.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(f);
        objectOutputStream.writeObject(mango);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("target/mango.dat"));
        Mango mango1 = (Mango) objectInputStream.readObject();
        assertThat(mango1, is(mango));
        assertThat(mango1 == mango, is(false));
    }
}
