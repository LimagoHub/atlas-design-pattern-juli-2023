package model;

public class Person {

    private String vorname;
    private String nachname;

    public Person() {
        this("John","Doe");
    }

    public Person(final String vorname, final String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(final String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(final String nachname) {
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static PersonenBuilder builder() {
        return new PersonenBuilder();
    }

    public static class PersonenBuilder {
        private Person person = new Person();

        private PersonenBuilder() {

        }

        public PersonenBuilder vorname(String vorname) {
            person.setVorname(vorname);
            return this;
        }

        public PersonenBuilder nachname(String nachname) {
            person.setNachname(nachname);
            return this;
        }

        public Person build() {
            return person;
        }
    }
}
