public class Artist extends Person {
    private String periods;

    public Artist()
    {
        this("unknown");
    }
    public Artist(String name) {
        super(name);
        periods="unknown";
    }

    public Artist(String name, String bornDate) {
        super(name, bornDate);
        periods="unknown";
    }

    public Artist(String name, String bornDate, String died) {
        super(name, bornDate, died);
        periods="unknown";
    }

    public Artist(String name, String bornDate, String died, String nationality) {
        super(name, bornDate, died, nationality);
        periods="unknown";
    }
    public Artist(String name, String bornDate, String died, String nationality,String periods) {
        super(name, bornDate, died, nationality);
        this.periods=periods;
    }

    public String getPeriods() {
        return periods;
    }

    public void setPeriods(String periods) {
        this.periods = periods;
    }

    @Override
    public String toString() {
        return super.toString()+" type : Artist" +
                "periods='" + periods + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Artist artist = (Artist) other;
        return periods.equals(artist.periods)&&super.equals(other);
    }

    @Override
    public int compareTo(Person other) {
        return 0;
    }
}
