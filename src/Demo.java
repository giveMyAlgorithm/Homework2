import java.io.IOException;

public class Demo {
    public static void main(String[] args)throws IOException {
        Vault v1=new Vault();
        for (Artist artist:v1.getArtistArrayList()
             ) {
            System.out.println(artist);

        }
    }

}
