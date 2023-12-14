public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    // Create - Add an item to the array
    public void add(int item) {
        // Resize if the array is full
        if (count == items.length) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }

        items[count++] = item;
    }

    // Read - Get an item at a particular index
    public int get(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException("Invalid index");

        return items[index];
    }

    // Update - Change an item at a particular index
    public void update(int index, int item) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException("Invalid index");

        items[index] = item;
    }

    // Delete - Remove an item at a particular index
    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException("Invalid index");

        for (int i = index; i < count - 1; i++)
            items[i] = items[i + 1];

        count--;
    }

    // Utility method to print the elements of the array
    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
