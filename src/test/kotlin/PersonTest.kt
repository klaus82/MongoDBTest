import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Claudio on 01/05/16.
 */
class PersonTest {
    @Test
    fun getName() {

        val person: Person = Person("Claudio", "Masolo",30);

        Assert.assertEquals(person.name,"Claudio");
    }

    @Test
    fun getSurname() {

        val person: Person = Person("Claudio", "Masolo",30);

        Assert.assertEquals(person.surname,"Masolo");

    }

    @Test
    fun getAge() {

        val person: Person = Person("Claudio", "Masolo",30);

        Assert.assertEquals(person.age,30);

    }

}