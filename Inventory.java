public class Inventory {
    private String[] array = new String[5];
    private int[] arrayVals = new int[5];

    public Inventory(String[] array) {
        this.array = array;
    }

    public void countInventory() {
        Scanner in = new Scanner(System.in);
        int i;
        int num;
        for (i = 0; i < arrayVals.length; ++i) {
            num = in.nextInt(); // read each item and store it in the array
            System.out.println("You have added " + num + " to your inventory.");
            break;
        }
    }

    public void inventoryItems() {
        array[0] = "glowing orb";
        array[1] = "3 daggers";
        array[2] = "sword";
        array[3] = "13 mushrooms";
        array[4] = "12 gold coins";

        System.out.println(" You have the following items in your inventory:");
        for (int k = 0; k < array.length; k++) { // loop through the array and print each item
            System.out.println("- " + array[k]);
        }
    }
}
