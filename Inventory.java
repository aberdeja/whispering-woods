import java.util.Scanner;

public class Inventory {
    private String[] array = new String[5];
    private int[] arrayVals = new int[5];

    public Inventory(String[] array) {
        this.array = array;
    }

    /**
     * Read counts for each inventory slot from standard input.
     * This fixes the original loop (which broke after first read).
     */
    public void countInventory() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arrayVals.length; i++) {
            System.out.print("Enter count for slot " + i + ": ");
            if (in.hasNextInt()) {
                int num = in.nextInt(); // read each item and store it in the array
                arrayVals[i] = num;
                System.out.println("You have added " + num + " to your inventory slot " + i + ".");
            } else {
                // If non-integer input, consume and treat as 0
                in.next();
                arrayVals[i] = 0;
                System.out.println("Invalid input, set slot " + i + " to 0.");
            }
        }
        in.close();
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

    // Print the inventory items using recursion.
    public void printInventoryRecursive() {
        printInventoryRecursive(0);
    }

    private void printInventoryRecursive(int index) {
        if (index >= array.length) return; // base case
        System.out.println("- " + array[index]);
        printInventoryRecursive(index + 1); // recursive case
    }

    // Compute total quantity stored in arrayVals using recursion.
    public int totalQuantityRecursive() {
        return totalQuantityRecursive(0);
    }

    private int totalQuantityRecursive(int index) {
        if (index >= arrayVals.length) return 0; // base case
        return arrayVals[index] + totalQuantityRecursive(index + 1); // recursive case
    }
}
