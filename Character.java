

public class Character {
private String name;
private int age;
private String proSubj;
private String proPossAdj;

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
    if (chosen.equals("long")) {
                System.out.print("Although it takes some time, " + name + " slowly but surely traces " + proPossAdj + " steps back through the Whispering Woods.");
                System.out.print(" Some time around noon that day, " + proSubj + " arrive back at " + proPossAdj + " little cottage, at the edge of town, where ");
                System.out.print(proSubj + " immediately set to work on the mushroom stew.");

        } else if (chosen.equals("short")) {
                System.out.print("Unfortunately, despite " + proPossAdj +
                " apparent confidence, it isn't long before a once familiar shortcut becomes distinctly unfamiliar, and " + proSubj + " quickly realize that "
                + proSubj + " are lost.");
                System.out.print("The further " + proSubj + " ventured into the Whispering Woods, the more lost " + proSubj + " felt."
        + proSubj + " tried to turn around and backtrack, but it was no use. The shortcut meant to cut travel time in half had instead lengthened "
        + proPossAdj + "journey. By the time " + proSubj + " finally found a clearing to stop in, it had been several hours since " + proObj + " had entered the woods.");
    

                Main.countHours(timeVal, hours, minVal);
        
                System.out.print(" since " + name + " had first entered the Whispering Woods, and " + proSubj + " were no closer to finding " + proPossAdj + " way out than when "
                + proSubj + " had first entered.");
                System.out.print(" As the sun began to set, " + proSubj + " realized that " + proSubj + " would have to spend the night in the woods.");
                System.out.print(" With no other options, " + name + " settled down for the night, hoping that morning would bring clarity, and a way out of the Whispering Woods.");

        } else {
                System.out.print("Please enter long or short");
        }
}

public void whichOne(string choice) {
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


    
}
