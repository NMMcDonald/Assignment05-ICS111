/*
Assignment05
Nicolas McDonald
ICS111 004
*/
import java.util.Scanner;

public class Assignment05 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        Voter v1 = new Voter(name);
        name = scan.nextLine();
        Voter v2 = new Voter(name);
        name = scan.nextLine();
        Voter v3 = new Voter(name);
        scan.close();
    }
}

class Voter {
    private static int nVoters;
    private int voterNumber;
    private String name="";
    private String voterID="";
    
    Voter(String n) {
        name=n;
        nVoters++;
        voterNumber=nVoters;
        voterID="HI"+n.length();
    }

    /**
     * 
     * @return
     */
    public static int getnVoters() {
        return nVoters;
    }

    public String toString() {
        return voterID + " "+ name;
    }
}