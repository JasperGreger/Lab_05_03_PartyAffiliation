import java.util.Scanner;
public class PartyAffiliation {
    static void main() {
        Scanner in = new Scanner(System.in);

        String partyAfil = "";

       IO.print("Enter your party affiliation [D R I]: ");
       partyAfil = in.nextLine();

    /*
       switch (partyAfil){
           case"D":
              IO.println("You get a Democratic Donkey.");
               return;
           case"R":
               IO.println("You get a Republican Elephant.");
                return;
           case"I":
               IO.println("You get an Independent Person.");
               return;
           default:
               IO.println("We don't know that party. " + partyAfil);
       }
    */

        if(partyAfil.equalsIgnoreCase("D")) {
            IO.println("You get a Democratic Donkey.");
        }
            else if (partyAfil.equalsIgnoreCase("R")) {
                IO.println("You get a Republican Elephant.");
            }
            else if (partyAfil.equalsIgnoreCase("I")) {
                    IO.println("You get an Independent Person.");
            }
            else {
                IO.println("We don't know that party. " + partyAfil);
            }





    }
}
