public class Sculpture extends Artworks {
    private String artist;
    private String material;
    private int weight;
    public Sculpture() {
        this("unknown");
    }

    public Sculpture(String name) {
        super(name);
        artist="Unknown";
        this.material="Unknown";
        this.weight=0;
    }

    public Sculpture(String name, String style) {
        super(name, style);
        this.material="Unknown";
        this.weight=0;
        artist="Unknown";
    }
    public Sculpture(String name, String style,String artist) {
        super(name, style);
        this.artist=artist;
        this.material="Unknown";;
        this.weight=0;
    }

    public Sculpture(String name, String style,String artist,String material) {
        super(name, style);
        this.artist=artist;
        this.material=material;
        this.weight=0;


    }
    //full constructor
    public Sculpture(String name, String style,String artist,String material,int weight) {
        super(name, style);
        this.artist=artist;
        this.material=material;
        this.weight=weight;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Sculpture sculpture = (Sculpture) other;
        return weight == sculpture.weight &&
                artist.equals(sculpture.artist) &&
                material.equals(sculpture.material)&&super.equals(other);
    }

    @Override //burayı doldurmayı unutma
    public int compareTo(Artworks other) {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+ "type : Sculpture " +
                "artist='" + artist + '\'' +
                ", material='" + material + '\'' +
                ", weight=" + weight +
                '}';
    }
}
