/*
Assignment05
Nicolas McDonald
ICS111 004
*/
import java.util.Scanner;

public class Assignment05 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);​
        String name="";

        System.out.println("Voter name: "+name);


    }
}

class Voter {
    private static int nVoters;
    private String name="";
    private String voterID="";
    
    Voter v = new Voter("");

    Voter(String n) {
        name=n;
        nVoters++;
        voterID="HI"+voterID.length();
    }

    /**
     * 
     * @return
     */
    public static int getnVoters() {
        return nVoters;
    }

    public String toString() {
        return voterID+name;
    }
}
