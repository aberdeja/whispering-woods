public class Character {
protected String name;
private int age;
protected String proSubj;
protected String proPossAdj;

public Character(String name, int age, String proSubj, String proPossAdj) {
    this.name = name;
    this.age = age;
    this.proSubj = proSubj;
    this.proPossAdj = proPossAdj;
}

public String getName() {
    return name;
}

public int getAge() {
    return age;
}

public String getProSubj() {
    return proSubj;
}

public String getProPossAdj() {
    return proPossAdj;
}

public void setName(String name) {
    this.name = name;
}

public void setAge(int age) {
    this.age = age;
}

public void setProSubj(String proSubj) {
    this.proSubj = proSubj;
}

public void setProPossAdj(String proPossAdj) {
    this.proPossAdj = proPossAdj;
}

public void choosenOne(String choice, int timeVal, int hours, int minVal) {
    if (choice.equals("long")) {
                System.out.print("Although it takes some time, " + name + " slowly but surely traces " + proPossAdj + " steps back through the Whispering Woods.");
                System.out.print(" Some time around noon that day, " + proSubj + " arrive back at " + proPossAdj + " little cottage, at the edge of town, where ");
                System.out.print(proSubj + " immediately set to work on the mushroom stew.");

        } else if (choice.equals("short")) {
                System.out.print("Unfortunately, despite " + proPossAdj +
                " apparent confidence, it isn't long before a once familiar shortcut becomes distinctly unfamiliar, and " + proSubj + " quickly realize that "
                + proSubj + " are lost.");
                System.out.print("The further " + proSubj + " ventured into the Whispering Woods, the more lost " + proSubj + " felt."
        + proSubj + " tried to turn around and backtrack, but it was no use. The shortcut meant to cut travel time in half had instead lengthened "
        + proPossAdj + "journey. By the time " + proSubj + " finally found a clearing to stop in, it had been several hours since " + proSubj + " had entered the woods.");
    

                Main.countHours(timeVal, hours, minVal);
        
                System.out.print(" since " + name + " had first entered the Whispering Woods, and " + proSubj + " were no closer to finding " + proPossAdj + " way out than when "
                + proSubj + " had first entered.");
                System.out.print(" As the sun began to set, " + proSubj + " realized that " + proSubj + " would have to spend the night in the woods.");
                System.out.print(" With no other options, " + name + " settled down for the night, hoping that morning would bring clarity, and a way out of the Whispering Woods.");

        } else {
                System.out.print("Please enter long or short");
        }
}

public void whichOne(String choice) {
    if (choice.equals("right")) {
        System.out.println("Choosing the right path, " + name + " soon found the edge of a clearing, wherein " + proSubj + " came across a familiar battered signpost, clearly marking the way back to town.");
        System.out.print("It was with great relief that " + proSubj + " followed the sign, eventually making it back to the safety of home.");
    } else if (choice.equals("left")) {
        System.out.println("Choosing the left path, " + name + " soon found " + proPossAdj + " way deeper into the heart of the Whispering Woods.");
    } else {
        System.out.print("Please enter left or right");
        }
    }
}

public class Info extends Character {
    public Info(String name, int age, String proSubj, String proPossAdj) {
        super(name, age, proSubj, proPossAdj);
    }

    @Override
    public void choosenOne(String choice, int timeVal, int hours, int minVal) {
        super.choosenOne(choice, timeVal, hours, minVal);

        if(choice.equals("long")) {
            System.out.print(" After a lengthy but uneventful journey," + name + " finally emerged from the Whispering Woods. Relieved to finally be free of the woods, "
            + getProSubj() + " made " + proPossAdj + " way to the nearest tavern, eager to see some friendly faces and share the tale of " + proPossAdj + " brief adventure.");
        } else if (choice.equals("short")) {
            System.out.print(" As night fell, " + name + "huddled beneath the thick canopy of the Whispering Woods, the sounds of nocturnal creatures echoing around "
                + proPossAdj + " makeshift campsite. As the sun began to set, " + proSubj + " realized that " + proSubj + " would have to spend the night in the woods.");
                System.out.print(" With no other options, " + name + " settled down for the night, hoping that morning would bring clarity, and a way out of the Whispering Woods.");
        } else {
            System.out.print("Please enter long or short");
        }
    
        }

    @Override
    public void whichOne(String choice) {
        super.whichOne(choice);

        if (choice.equals("right")) {
            System.out.print(" Taking a gamble, " + name + " turned right, and soon found " + proPossAdj + " way back to the edge of the Whispering Woods. "
            + proSubj + " emerged from the trees, blinking in the bright sunlight, grateful to be free of the woods' eerie embrace.");
        } else if (choice.equals("left")) {
            System.out.print(" Venturing deeper into the Whispering Woods, " + name + " soon found " + proPossAdj + " surroundings growing darker and more foreboding. "
            + proSubj + " could hear strange whispers on the wind, and the feeling of being watched grew stronger with each step.");
        } else {
            System.out.print("Please enter left or right");
            }
        }

    @Override
    public void whichOne(String choice) {
        super.whichOne(choice);

        if (choice.equals("right")) {
            System.out.print("Feeling wary but hopeful, " + name + " turned right at the fork in the path. Although the path was overgrown and difficult to navigate,");
            System.out.print(" and it took some time, " + proSubj + " eventually made it back to the edge of the Whispering Woods. Emerging from the trees, " + proSubj + 
            " were greeted by the sight of a familiar run down tavern, where " + proSubj + " knew " + proSubj + " would find some friendly faces and a warm meal.");
        } else if (choice.equals("left")) {
            System.out.print("Venturing deeper into the Whispering Woods, " + name + " soon found " + proPossAdj + " surroundings growing darker and more foreboding.");
            System.out.print(proSubj + " could hear strange whispers on the wind, and the feeling of being watched grew stronger with each step.");
        } else {
            System.out.print("Please enter left or right.");
        }
        }
    

    public void choices(String choose) {
        if (choose.equals("approach")) {
            System.out.println("Stumbling forward, " + name + " came to an abrupt halt before the pond, dropping to " + proPossAdj + " knees before it. " + proSubj + " pushed up " + proPossAdj +
                " sleeves and reached out to touch the water's surface. As soon as their fingers made contact, a strange glow seemed to overtake the pond, and, before " + proSubj + 
                " could react, a slimy tentacle shot out of the water, wrapping around " + proPossAdj + " wrist and holding tight, as a voice echoed throughout the clearing: ");
                System.out.print("'WHO GOES THERE?' the voice boomed. 'WHY DO YOU DISTURB THE SACRED POND OF THE WHISPERING WOODS?' it demanded.");
                System.out.print(" With a terrified shout, " + name + " scrambled backwards, desperately trying to break free of the tentacle, to no avail.");
        } else if (choose.equals("retreat")) {
            System.out.println("Despite the allure of the pond, " + name + " wisely decided against approaching it. Instead, " + proSubj + " turned back around and hurried away from the clearing.");
            System.out.print(" Over the next day, " + name + " though often about that pond, especially as day once again gave way to night, and " + proSubj + " was forced to stay another night in the Whispering Woods.");
            System.out.print(" Thankfully, " + proSubj + " finally found " + proPossAdj + " way out the very next morning, emerging from the woods just as the sun was rising. After that, " + name + 
                " almost completely forgot about the strange pond deep in the Whispering Woods.");
        } else {
            System.out.print("Please enter approach or retreat.");
        }
        }
            
    }



    
