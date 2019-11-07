public class Architect extends Person {

    public Architect() {
    }

    public Architect(String name) {
        super(name);
    }

    public Architect(String name, String bornDate) {
        super(name, bornDate);
    }

    public Architect(String name, String bornDate, String died) {
        super(name, bornDate, died);
    }

    public Architect(String name, String bornDate, String died, String nationality) {
        super(name, bornDate, died, nationality);
    }



    @Override
    public int compareTo(Person other) {
        return 0;
    }
}
