/*
Assignment05
Nicolas McDonald
ICS111 004
*/
import java.util.Scanner;

public class Assignment05 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
       
        System.out.print("Voter name: ");
        String next = scan.nextLine();
        Voter v1 = new Voter(next);
        System.out.println("Voter " + Voter.getnVoters() + " created.");
       
        System.out.print("Voter name: ");
        next = scan.nextLine();
        Voter v2 = new Voter(next);
        System.out.println("Voter " + Voter.getnVoters() + " created.");
       
        System.out.print("Voter name: ");
        next = scan.nextLine();
        Voter v3 = new Voter(next);
        System.out.println("Voter " + Voter.getnVoters() + " created.");
        //System.out.println(Integer.toBinaryString(name));
        
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        scan.close();
    }
}

class Voter {
    public static String getnVoters;
    private static int nVoters =0;
    private String name="";
    private String voterID="";
    
    /**
     * Accepts the name, ID, and number of the voter.
     * @param n stores voter information.
     */
    Voter(String n) {
        name=n;
        nVoters++;
        voterID="HI"+n.length();
    }

    /*
     * The number of voters in a string data type.
     * @return the number of voters.
     */
    public static int getnVoters() {
        return nVoters;
    }

    /* Returns the whole ID of each voter.
     * @return voters ID and the name they input.
     */
    public String toString() { 
        return voterID + " "+ name;
    }
}