import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {
    private ArrayList<Painting> paintingArrayList;
    private ArrayList<Architecture> architectureArrayList;
    private ArrayList<Sculpture> sculptureArrayList;
    private ArrayList<Architect> architectArrayList;
    private ArrayList<Artist> artistArrayList;
    public CSVReader() throws IOException
    {
        arrayListInitializer();
        Reader();
    }

    // this method initialize arrayLists
    private void arrayListInitializer()
    {
        paintingArrayList= new ArrayList<Painting>();
        architectureArrayList= new ArrayList<Architecture>();
        sculptureArrayList= new ArrayList<Sculpture>();
        artistArrayList= new ArrayList<Artist>();
        architectArrayList= new ArrayList<Architect>();
    }


    private void Reader() throws IOException
    {
        BufferedReader scan= new BufferedReader(new FileReader("CENG211_HW2_ArtVaultData.csv"));
        String line;
        String[] lineArray;
        while((line=scan.readLine())!=null)
        {
            lineArray=line.split(",");
            int objectNumber=Integer.parseInt(lineArray[0]);
            adder(lineArray,objectNumber);



        }

    }

    /*this methods checks the object number for given data and create an object for the given data according to object number then
    adds to the corresponding arrayList */
    private void adder(String[] data,int objectNumber)
    {
        switch(objectNumber)
        {
            case 1:
                Painting tempPainting = new Painting(data[1],data[2],data[3],Integer.parseInt(data[4]),Integer.parseInt(data[5]));
                paintingArrayList.add(tempPainting);
                break;
            case 2:
                Sculpture tempSculpture = new Sculpture(data[1],data[2],data[3],data[4],Integer.parseInt(data[5]));
                sculptureArrayList.add(tempSculpture);
                break;
            case 3:
                Architecture tempArchitecture=new Architecture(data[1],data[2],Double.parseDouble(data[3]),Double.parseDouble(data[4]),Double.parseDouble(data[5]),data[6]);
                architectureArrayList.add(tempArchitecture);
                break;
            case 4:
                Artist tempArtist=new Artist(data[1],data[2],data[3],data[4],data[5]);
                artistArrayList.add(tempArtist);
                break;
            case 5:
                Architect tempArchitect=new Architect(data[1],data[2],data[3],data[4]);
                architectArrayList.add(tempArchitect);
                break;
            default:
                throw new SecurityException("The given object number is not fitting the program. ");
        }

    }

    public ArrayList<Painting> getPaintingArrayList() {
        return paintingArrayList;
    }

    public ArrayList<Architecture> getArchitectureArrayList() {
        return architectureArrayList;
    }

    public ArrayList<Sculpture> getSculptureArrayList() {
        return sculptureArrayList;
    }

    public ArrayList<Architect> getArchitectArrayList() {
        return architectArrayList;
    }

    public ArrayList<Artist> getArtistArrayList() {
        return artistArrayList;
    }
}
