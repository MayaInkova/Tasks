package algorithms.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Name {
    String firstName;
    String middleName;
    String lastName;

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // Презаписване на equals() за сравнение на обектите по стойност
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(firstName, name.firstName) &&
                Objects.equals(middleName, name.middleName) &&
                Objects.equals(lastName, name.lastName);
    }

    // Презаписване на hashCode() за коректна работа с HashMap
    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName);
    }
}
