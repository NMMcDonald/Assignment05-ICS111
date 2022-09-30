/*
Assignment05
Nicolas McDonald
ICS111 004
*/
import java.util.Scanner;

public class Assignment05 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String name ="";
        

        Voter v1 = new Voter(name);
        Voter v2 = new Voter(name);
        Voter v3 = new Voter(name);

        String next = scan.nextLine();
        System.out.println("Voter name: " + next);
        System.out.println("Voter " + Voter.getnVoters + " created.");
        System.out.println("Voter name: " + next);
        System.out.println("Voter " + Voter.getnVoters + " created.");
        System.out.println("Voter name: ");
        System.out.println("Voter " + Voter.getnVoters + " created.");
        /*
        System.out.println("Voter name: ");
        name = scan.nextLine();
        System.out.println("Voter " + Voter.getnVoters + " created.");

        System.out.println("Voter name: ");
        name = scan.nextLine();
        System.out.println("Voter " + Voter.getnVoters + " created.");
        */
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        scan.close();
    }
}

class Voter {
    public static String getnVoters;
    private static int nVoters;
    private String name="";
    private String voterID="";
    
    Voter(String n) {
        name=n;
        nVoters++;
        voterID="HI"+n.length();
    }

    /**
     * 
     * @return
     */
    public static int getnVoters() {
        return nVoters;
    }

    public String toString() { //use toString in your main method when you call it at the end
        return voterID + " "+ name;
    }
}