import java.util.Scanner;

public class User {
    Scanner scan=new Scanner(System.in);
    String decision;
    public User()
    {

    }
    public void mainMenu()
    {
        System.out.println("Please enter the number of operation you want to perform:");
        System.out.println("1- Print the vault");
        System.out.println("2- Search the vault");
        System.out.println("3- Trade");
        System.out.println("0- Exit");
    }
    public void printTheList()
    {

        printListMenu();
        decision=scan.nextLine();




    }
    private void printListMenu()
    {
        System.out.println("Please choose the list: ");
        System.out.println("1-) Print the list of artist");
        System.out.println("2-) Print the list of architects");
        System.out.println("3-) Print the list of paintings");
        System.out.println("4-) Print the list of sculptures");
        System.out.println("5-) Print the list of architectures");
        System.out.println("0-) Exit");
    }



}



