public class Architecture extends Artworks{
    private String architects;
    private double length;
    private double width;
    private double height;
    public Architecture() {
        this("unknown");
    }

    public Architecture(String name) {
        super(name);
        architects="Unknown";
    }

    public Architecture(String name, String style) {
        super(name, style);
        architects="Unknown";
    }
    public Architecture(String name, String style,double length,double width,double height) {
        super(name, style);
        this.length=length;
        this.width=width;
        this.height=height;
        architects="Unknown";
    }
    //full constructor
    public Architecture(String name, String style,double length,double width,double height,String architects) {
        super(name, style);
        this.length=length;
        this.width=width;
        this.height=height;
        this.architects=architects;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Architecture that = (Architecture) other;
        return length == that.length &&
                width == that.width &&
                height == that.height &&
                architects.equals(that.architects)&&super.equals(other);
    }

    @Override
    public int compareTo(Artworks other) {
        return 0;
    }



    @Override
    public String toString() {
        return super.toString()+"type : Architecture " +
                "architects='" + architects + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
