public class Painting extends Artworks {
    private String artist;
    private int width;
    private int length;
    public Painting() {
        super();
        artist="Unknown";
        width=0;
        length=0;

    }

    public Painting(String name) {
        super(name);
        artist="Unknown";
        width=0;
        length=0;
    }

    public Painting(String name,String style) {
        super(name,style);
        artist="Unknown";
        width=0;
        length=0;
    }
    public Painting(String name,String style,String artist) {
        super(name,style);
        this.artist=artist;
        width=0;
        length=0;
    }

    //full constructor;
    public Painting(String name,String style,String artist,int width,int length) {
        super(name,style);
        this.artist=artist;
        this.width=width;
        this.length=length;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Painting painting = (Painting) other;
        return width == painting.width &&
                length == painting.length &&
                artist.equals(((Painting) other).artist)&&super.equals(other);
    }


    @Override
    public String toString() {
        return super.toString()+ " type : Painting " +
                "artist='" + artist + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    //burayı doldurmayı unutma
    @Override
    public int compareTo(Artworks other) {
        return 0;
    }


}
