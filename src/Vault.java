import java.io.IOException;
import java.util.ArrayList;

public class Vault {
    private ArrayList<Painting> paintingArrayList;
    private ArrayList<Architecture> architectureArrayList;
    private ArrayList<Sculpture> sculptureArrayList;
    private ArrayList<Architect> architectArrayList;
    private ArrayList<Artist> artistArrayList;
    public Vault() throws IOException
    {
        CSVReader fileIO= new CSVReader();
        paintingArrayList=fileIO.getPaintingArrayList();
        architectureArrayList=fileIO.getArchitectureArrayList();
        sculptureArrayList=fileIO.getSculptureArrayList();
        architectArrayList=fileIO.getArchitectArrayList();
        artistArrayList=fileIO.getArtistArrayList();

    }

}
