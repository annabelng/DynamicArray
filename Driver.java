
public class Driver {

	public static void main(String[] args) {
		
		//use the GrowArray class to see if it works as intended
		GrowingArray myArray = new GrowingArray();
		System.out.println("init size: " + myArray.getSize());
		
		//try adding one element then check the size, did it grow?
		myArray.add(5);
		System.out.println("size after adding 1 element: " + myArray.getSize());
		
		//test to see that it's resizing properly by adding more than 10 elements
		for(int i = 0; i < 20; i ++){
			myArray.add(i);	//try adding 20 more things
		}
		
		System.out.println("size after adding 20 more: " + myArray.getSize());
		
		//printing out original array
		for(int i = 0; i < myArray.getSize(); i ++){
			System.out.print(myArray.get(i) + " ");
		}
		//new line
		System.out.println("");
		
		//removing index 0
		myArray.remove(0);
	
		//printing new array
		for(int i = 0; i < myArray.getSize(); i ++){
			System.out.print(myArray.get(i) + " ");
		}
		//new line
		System.out.println("");
		
		//removing index 10
		myArray.remove(10);
	
		//printing new array
		for(int i = 0; i < myArray.getSize(); i ++){
			System.out.print(myArray.get(i) + " ");
		}
		
		myArray.add(5, 20);
	
		//printing new array
		for(int i = 0; i < myArray.getSize(); i ++){
			System.out.print(myArray.get(i) + " ");
		}
		
		System.out.println("");
		System.out.println("new size: " + myArray.getSize());

	}

}
