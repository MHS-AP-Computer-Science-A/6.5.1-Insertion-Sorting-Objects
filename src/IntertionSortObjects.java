
public class IntertionSortObjects {
	public static void main(String[] args) {
		// Create an array of Teams
		Team[] teams = { new Team("Tigers", 23, 35), new Team("Royals", 26, 34), new Team("Twins", 36, 24),
				new Team("White Sox", 35, 25), new Team("Blue Jays", 32, 28), new Team("Yankees", 33, 27),
				new Team("Rays", 40, 20), new Team("Orioles", 25, 35), new Team("Red Sox", 24, 36),
				new Team("Athletics", 34, 24), new Team("Rangers", 22, 38), new Team("Astros", 29, 31),
				new Team("Rangers", 22, 38), new Team("Angels", 26, 34), new Team("Mariners", 27, 33) };

		// Insertion sort in non-descending order by win percentage
		insertionSort(teams);

		// Display final list (try using a for-each loop)

	}

	public static void insertionSort(int[] arr) {
		// We assume the first element is sorted, so we
		// begin at the second element and go to the end
		for (int index = 1; index < arr.length; index++) {
			// Select the element as the key
			// The item to be inserted at the end
			int toInsert = arr[index];
			// Set position to the last sorted item
			int sortedIndex = index - 1;
			// Keep shifting the elements until we find the correct insertion
			// spot or hit the front of the list
			while (sortedIndex >= 0 && arr[sortedIndex] > toInsert) {
				arr[sortedIndex + 1] = arr[sortedIndex];
				sortedIndex--;
			}
			// Insert the element
			arr[sortedIndex + 1] = toInsert;
		}
	}
}
