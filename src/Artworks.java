public abstract  class Artworks implements IComparable<Artworks> {
    private String name;
    private String style;
    //Default constructor
    public Artworks()
    {
        this.name="Unknown";
        this.style="Unknown";
    }
    // Constructor with name
    public Artworks(String name)
    {
        this.name=name;
        this.style="Unknown";
    }

    //Full constructor
    public Artworks(String name,String style)
    {
        this.name=name;
        this.style=style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }


    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", style='" + style + '\'' +", "
                ;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Artworks artworks = (Artworks) other;
        return name.equals(artworks.name) &&
                style.equals(artworks.style);
    }



    @Override
    public abstract int compareTo(Artworks other);

}
