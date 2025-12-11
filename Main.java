import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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

        public class LeftRightButtons {
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        


        //--- Collect basic character info ---
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

        //--- Prologue paragraph (≥ 5 sentences using ≥ 5 variables) ---
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

        //(You will add TWO more paragraphs below for your submission.)
        //TIP: Use more variables to store place names, items, stats, etc.

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

        Character.choosenOne(in.next().toLowerCase(), totTime, hours, userMin);

        System.out.println(" The next morning, " + name + " awoke to the sound of birds chirping, and dim light filtering through the thick canopy of trees.");
        System.out.print(" Stretching " + proPossAdj + " arms, " + proSubj + " took a moment to gather " + proReflex + " as " + proSubj + " prepared to continue " + proPossAdj + " journey.");
        System.out.print(" However, before " + proSubj + " set out, " + proSubj + " decided to take a moment to take stock of " + proPossAdj + " belongings.");
        System.out.print(" Reaching into " + proPossAdj + " " + container + ", " + proSubj + " counted the items within, making sure that everything was still there after the unexpected night in the woods.");

        String[] inventoryContents = new String[5]; // create an array to hold inventory items
        Inventory inv = new Inventory(inventoryContents);
        inv.inventoryItems();

        System.out.println(" Having taken stock of " + proPossAdj + " belongings, " + name + " felt a renewed sense of determination, ready to face whatever challenges may lay ahead.");
        System.out.print(" With one more glance at the clearing, " + proSubj + " hoisted " + proPossAdj + container + " onto " + proPossAdj + " back and set out once more into the Whispering Woods.");
        System.out.print(" Although the night before things had been uncertain, " + name + " felt the light of day brought with it a new sense of purpose.");
        System.out.print(" Thus, " + proSubj + " set off into the woods, eager to return home with " + proPossAdj + " gathered " + veg + " and a silly story to tell any who might ask.");
        System.out.print(" After all, not many could claim to have spent a night in the Whispering Woods and lived to tell the tale. It was a thought that " + name + " tried not to dwell on too much as " 
        + proSubj + " made " + proPossAdj + " way back through the trees, sharp eyes keeping a look out for any sign of movement in the underbrush.");
        System.out.print(" Each step was a little more uneasy than the last, but " + name + " pressed on, determined to make it back to the safety of " + proSubj + " home.");
        System.out.print( " " + proSubj + " continued deeper into the woods, the path ahead growing darker and more foreboding with each passing hour.");
        System.out.print(" Eventually, " + proSubj + " came across a fork in the path, forcing " + proObj + " to make a choice: should " + proSubj + " go left or right?");

         SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Left or Right?");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 100);
            frame.setLayout(new FlowLayout());

            JButton leftButton = new JButton("Left");
            JButton rightButton = new JButton("Right");

            leftButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("You chose Left!");
                    System.out.println("Venturing deeper into the Whispering Woods, " + name + " soon found " + proPossAdj + " surroundings growing darker and more foreboding.");
            System.out.print(proSubj + " could hear strange whispers on the wind, and the feeling of being watched grew stronger with each step.");
                }
            });

            rightButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("You chose Right!");
                    System.out.print("Feeling wary but hopeful, " + name + " turned right at the fork in the path. Although the path was overgrown and difficult to navigate,");
                System.out.println(" and it took some time, " + proSubj + " eventually made it back to the edge of the Whispering Woods. Emerging from the trees, " + proSubj + 
            " were greeted by the sight of a familiar run down tavern, where " + proSubj + " knew " + proSubj + " would find some friendly faces and a warm meal.");
                }
            });

            frame.add(leftButton);
            frame.add(rightButton);

            frame.setVisible(true);
        });

        System.out.println("As the feeling of being watched persisted, " + name + " kept an eye out for any sort of movement, but the further " + proSubj +
        " ventured, the more isolated " + proSubj + " felt. For all intents and purposes, the forest seemed almost empty, despite the unnatural whispers that followed " + proObj +
        ". In fact, there had been no sign of any other living creatures since " + proSubj + " had encountered the bunny in the mushroom grove.");
        System.out.print(" Even the birds and insects were silent, as if the entire forest was holding its breath. It made " + name + " all the more anxious to find a way home.");
        System.out.print(" Hours seemed to stretch into an eternity as " + proSubj + " navigated the labyrinthine paths of the Whispering Woods. The foliage seemed to grow denser and more difficult to traverse as " + proSubj +
        " pressed forward, each step taking a little more effort than the last. Then, suddenly, " + name + " found " + proReflex + " stumbling into a clearing.");
        System.out.print(" It was a rather large clearing, with sunlight streaming down through a break in the canopy above. However, what caught " + proPossAdj +
        " attention was the sight of a decently sized pond in the center of the clearing, its surface shimmering in the dappled light. This was the first sign of water " + name +
        " had seen since entering the woods, and " + proSubj + " felt a sudden wave of thirst wash over " + proObj + ". From here, the water appeared clear and crystaline, filtering out on both sides into a brook connected out into the trees at the forest edge.");
        System.out.print(" Should " + name + " approach the pond or turn around? Enter approach or retreat: ");

        Character.choices(in.next().toLowerCase());

        System.out.println("For one panic-fueled moment, all " + name + " could do was flounder in place, heart hammering in " + proPossAdj + " chest as " + proSubj + " struggled.");
        System.out.print(" Then, with a jolt, " + proSubj + " remembered the sword at " + proPossAdj + " back. Fumbling slightly, it took a moment, but " + proSubj + " finally managed to yank it free of the sheath.");
        System.out.print(proSubj + " raised it above " + proPossAdj + " head, ready to cut " + proPossAdj + " way free, when the tentacle went tense and still, and that voice commanded, 'WAIT!'");
        System.out.print(name + " froze, sword still raised, pausing to listen. After a moment, the voice spoke once more, 'YOU WOULD DARE HARM ME IN MY OWN WOODS?' The tentacle loosened around " + proPossAdj +
        " arm slightly, before releasing " + proObj + " entirely. 'Who...who are you?' " + name + " stammered, scooting backwards in the grass to gain some distance from what appeared to be a giant talking octopus emerging from the pond.");
        System.out.print(" 'I AM THE GUARDIAN OF THESE WOODS,' the creature boomed. 'FEW HAVE EVER LAID EYES UPON ME AND LIVED TO TELL THE TALE. WHY DO YOU DISTURB MY POND?' it demanded.");
        System.out.print(" 'I just wanted something to drink,' " + name + " replied nervously. 'I didn't mean any harm. I'm lost and trying to find my way home.'");
        System.out.print(" The guardian of the forest regarded " + proObj + " with what appeared to be a rather unimpressed look. 'LOST?' it echoed. 'MANY HAVE ENTERED THESE WOODS, FEW HAVE EVER LEFT. IF YOU WISH TO LEAVE, I CAN HELP YOU FOR A PRICE.'");
        System.out.print(" " + name + " hesitated, unsure of what to do. Finally, " + proSubj + " nodded. 'What is the price?' " + proSubj + " asked, eager to find a way out of the Whispering Woods.");
        System.out.print(" The guardian hummed thoughtfully, seeming to think it over for a moment. 'YOUR SOUL,' it finally declared. " + name + " stared at the creature in disbelief, mouth agape. Then, suddenly, a booming laugh filled the clearing.");
        System.out.print(" 'YOU SHOULD SEE YOUR FACE!' the guardian exclaimed, clearly amused. 'I JEST! I DO NOT WANT YOUR SOUL, SILLY LITTLE MORTAL. INSTEAD, I WILL TAKE YOUR SWORD AS PAYMENT.'");
        System.out.print(" " + name + " blinked, still trying to process everything that was happening. Finally, " + proSubj + " nodded slowly. 'Fine,' " + proSubj + " agreed, reluctantly placing the sword down in the grass before the pond.");
        System.out.print(" The guardian reached out a tentacle, wrapping it around the sword and pulling it into the water with a splash. 'A WISE CHOICE,' it told " + proObj + ".");
        System.out.print(" 'NOW, TURN AROUND AND CLOSE YOUR EYES. WHEN YOU OPEN THEM AGAIN, YOU WILL BE SAFE OUTSIDE THE WOODS.' " + name + " gave the creature a narrow-eyed look, uncertain if " + proObj + " should trust it.");
        System.out.print(" However, with little other choice, " + proSubj + " did as instructed, turning around and closing " + proPossAdj + " eyes. After a few long moments of the creature mumbling to itself, " + name +
        " was suddenly drenched in cold water, as if hit from behind with a wave. Opening " + proPossAdj + " eyes, " + proSubj + " spun back around to give the creature a piece of " + proPossAdj + " mind, only to find that the guardian of the woods was gone.");
        System.out.print(" In fact, the entire clearing had disappeared. In its place was the edge of the Whispering Woods, sunlight streaming down from above. In the distance, " + name + 
        "could see the familiar sight of a run-down tavern, smoke curling up from its chimney. " + proSubj + " had finally made it out.");
        System.out.print(" With a relieved sigh, " + name + " began making " + proPossAdj + " way toward the tavern, eager to find some food and a warm bed to rest in after the rather harrowing experience in the Whispering Woods.");
        
        in.close();
    }
}
}

