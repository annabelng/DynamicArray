public class GrowingArray {

	private int[] data; // stores elements
	private int size; // keeps track of the number of valid ELEMENTS

	public GrowingArray() {
		data = new int[10];

		// size stands for how many elements have been ADDED
		size = 0;
	}

	// remove the element at the given index
	public void remove(int index) {

		// going through array starting at given index
		// remove element by shifting everything to its right to the left
		for (int i = index; i < size - 1; i++) {
			// adding temp variable to hold element value in front of given
			// index
			int temp = data[i + 1];

			// replacing index w temp value
			data[i] = temp;
		}
		// adjusting size
		size--;

	}

	// METHOD OVERLOADING: when you have multiple copies of a method
	// with the only difference being the parameters
	public void add(int index, int el) {
		// 2nd version of add
		// insert the element at the given index

		// do you need to worry about resizing? copy code from original add if
		// so
		if (size >= data.length) {

			// grow the array... but by how much?
			int[] bigger = new int[size + 1]; // make a bigger array that can
												// contain 1 more element
			for (int i = 0; i < data.length; i++) {
				bigger[i] = data[i]; // copy from data array into bigger array
			}

			data = bigger; // new data array needs to point to the bigger array
		}

		// do you need to be shifting things? copy code from remove
		for (int i = index + 1; i < size; i++) {
			// adding temp variable to hold element value in front of given
			// index
			int temp = data[i - 1];

			// replacing index w temp value
			data[i] = temp;
		}
		data[index] = el;
		size++; // update size

	}

	/*
	 * Adds an element in the next open spot if there's not a spot, resize the
	 * array and add the element
	 */
	public void add(int el) {

		// check if it is NOT ok to add (lack of space)
		if (size >= data.length) {

			// grow the array... but by how much?
			int[] bigger = new int[size + 1]; // make a bigger array that can
												// contain 1 more element
			for (int i = 0; i < data.length; i++) {
				bigger[i] = data[i]; // copy from data array into bigger array
			}

			data = bigger; // new data array needs to point to the bigger array

		}

		// add element into the next spot
		data[size] = el;
		size++; // update size

	}

	// return the element from the data array at the given index
	public int get(int index) {
		return data[index];
	}

	// getter for data
	public int[] getData() {
		return data;
	}

	// getter for size
	public int getSize() {
		return size;
	}

}
