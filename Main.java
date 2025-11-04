import java.util.Scanner;

public class Main {
        // method to count hours spent in the woods
        public static void countHours(int timeVal, int hours, int minVal) { 
                hours = timeVal / 60;
                minVal = timeVal % 60;

                System.out.print("It has been " + hours + " hours and " + minVal + " minutes");
}

        public static String chooseOne(String choice) {
                return choice;
        }
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Inventory inv = new Inventory();

        // --- Collect basic character info ---
        System.out.print("Enter your character's name: ");
        String name = in.nextLine();

        System.out.print("Choose a pronoun subject (he/she/they): ");
        String proSubj = in.next().toLowerCase();         // e.g., he / she / they

        System.out.print("Choose a pronoun object (him/her/them): ");
        String proObj = in.next().toLowerCase();          // e.g., him / her / them

        System.out.print("Choose a reflexive pronoun (himself/herself/themself): ");
        String proReflex = in.next().toLowerCase();       // e.g., himself / herself / themself

        System.out.print("Choose a possessive adjective (his/her/their): ");
        String proPossAdj = in.next().toLowerCase();      // e.g., his / her / their

        System.out.print("Enter your character's age: ");
        int age = in.nextInt();
        Character character = new Character(name, age, proSubj, proPossAdj);
        // An example integer you can reference later (feel free to rename/use differently)
        int gold = 12;
        // Additional items for the adventurer's use
        String lightSource = "glowing orb";
        String tool = "daggers";
        String weapon = "sword";

        // Descriptors
        String action = "ventured";
        String area = "grove";
        String veg = "mushrooms";
        String place = "woods";
        String container = "pack";
        String noise = "whispers";

        // variables for my loops
        String chosen;
        
        

        // additional integers
        int numTool = 3;
        int hours = 0;
        int totTime = 0;
        int userMin = 0;

        // --- Prologue paragraph (≥ 5 sentences using ≥ 5 variables) ---
        System.out.println();
        System.out.println("~ ~ ~ Adventure Prologue ~ ~ ~");
        System.out.println(name + " set out at dawn, " + proPossAdj + " pack light and hopes high.");
        System.out.println("At only " + age + " years old, " + proSubj + " already carries stories that most would never dare to tell.");
        System.out.println("In the pouch at " + proPossAdj + " side clinked " + gold + " gold coins— "
                + "not much, but enough for bread and a bed in a quiet inn.");
        System.out.println("A weathered sign pointed toward the Whispering Woods, and " + proSubj
                + " felt a shiver that had nothing to do with the cold.");
        System.out.println("Whatever waited beyond the treeline would test " + proObj + ", but " + name
                + " walked on without looking back.");
        // --- 2 paragraphs, 5 - 7 sentences ---

        // (You will add TWO more paragraphs below for your submission.)
        // TIP: Use more variables to store place names, items, stats, etc.

        System.out.print("As " + name + " approached the entrance to the Whispering Woods, " + proSubj + " reached into " + proPossAdj + " bag.");
        System.out.print(" From within " + proPossAdj + " " + container + " " + proSubj + " produced a " + lightSource + ", which helped to light the path ahead, as " 
                + proSubj + " began " + proPossAdj + " journey into the " + place + ".");
        System.out.print(" The further " + name + " " + action + " forward, the more " + proSubj + " were reminded of where the name originated.");
        System.out.print(" Although there was no sign of other people nearby, the sound of " + noise + " deep within the " + place + " had " 
                + name + " checking over " + proPossAdj + " shoulder more than once throughout " + proPossAdj + " travels.");
        System.out.print(" Thankfully, it didn't take very long to reach " + proPossAdj + " destination.");
        System.out.println(" Before long, " + proSubj + " found " + proReflex + " in a small " + area + ", surrounded by little glowing " + veg + ".");

        System.out.print("Crouching down, " + name + " reached into " + proPossAdj + " " + container 
        + " once more and pulled out a set of " + numTool + " " + tool + ".");
        System.out.print(" Taking one of the " + tool + ", " + proSubj + " began carefully cutting away at the roots of the " + veg + ".");
        System.out.print(" After a little while, " + proSubj + " had a decent sized pile of 13 glowing " + veg + ", which " + proSubj 
        + " began tossing into " + proPossAdj + " " + container + ".");
        System.out.print(" These " + veg + " were just the thing needed for tonights dinner.");
        System.out.println(" Please add these new items to your inventory");
        
        int size = 13; // specify the size of the array
        
        int[] inventory = new int[size]; // create an array of the specified size

        System.out.print("Enter the number of " + veg + " you want to add to your inventory: ");

        countInventory(inventory); // call the method to read and store the items in the array
        
        System.out.print("Just as " + name + " finished packing up, the sound of snapping branches caught " + proPossAdj + " attention.");
        System.out.println(" Taking the " + weapon + " from " + proPossAdj + " back, " + proSubj + " spun around to face the potential threat.");

        System.out.print("Only to find " + proReflex + " facing down a startled looking bunny, who quickly turned tail and darted back into the bushes. Letting out an amused huff, " 
        + proSubj + " returned the sword to the sheath on " + proPossAdj + " back, relieved to see there was no danger.");
        System.out.print(" Taking one last look at the " + place + ", " + proSubj + " turned around, ready to venture back into the Whispering Woods, and make " 
        + proPossAdj + " way home.");
        System.out.print(" But first, " + proSubj + " had to make a decision. Did " + proSubj + " want to take the long way home, or find a shortcut?");
        System.out.println(" Enter long or short to choose: ");
        System.out.println(" How many minutes has it been since " + name + " entered the woods?");
        totTime = in.nextInt();

        character.choosenOne(in.next().toLowerCase(), totTime, hours, userMin);

        System.out.println(" The next morning, " + name + " awoke to the sound of birds chirping, and dim light filtering through the thick canopy of trees.");
        System.out.print(" Stretching " + proPossAdj + " arms, " + proSubj + " took a moment to gather " + proReflex + " as " + proSubj + " prepared to continue " + proPossAdj + " journey.");
        System.out.print(" However, before " + proSubj + " set out, " + proSubj + " decided to take a moment to take stock of " + proPossAdj + " belongings.");
        System.out.print(" Reaching into " + proPossAdj + " " + container + ", " + proSubj + " counted the items within, making sure that everything was still there after the unexpected night in the woods.");

        String[] inventoryContents = new String[5]; // create an array to hold inventory items
        Inventory inv = new Inventory(inventoryContents);
        inv.inventoryItems();

      
        
    }
}

