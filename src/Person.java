
public abstract class Person implements IComparable<Person>{
    private String name;
    private String bornDate;
    private String died;
    private String nationality;
    public Person()
    {
        this("unknown");
    }
    public Person(String name) {
        this(name,"unknown");
    }

    public Person(String name, String bornDate) {
        this(name,bornDate, "unknown");
    }


    public Person(String name, String bornDate, String died) {
        this(name,bornDate,died,"unknown");
    }

    public Person(String name, String bornDate, String died, String nationality) {
        this.name = name;
        this.bornDate = bornDate;
        this.died = died;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public String getDied() {
        return died;
    }

    public void setDied(String died) {
        this.died = died;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public abstract int compareTo(Person other);

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Person person = (Person) other;
        return name.equals(person.name) &&
                bornDate.equals(person.bornDate) &&
                died.equals(person.died) &&
                nationality.equals(person.nationality);
    }
    

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", bornDate='" + bornDate + '\'' +
                ", died='" + died + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
