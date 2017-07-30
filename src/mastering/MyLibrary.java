package mastering;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import mastering.modal.Book;
import mastering.modal.Topic;

public class MyLibrary {

	public static List<Book> library = new ArrayList<>();
	static {
		Book b = new Book("Ramayan",Arrays.asList( "Valmiki"), new int[]{2321, 2441, 2399, 2889},Topic.HINDUISM,Year.of(1947),20.0);
		library.add(b);
		
		b = new Book("Ramcharit Manas",Arrays.asList( "Tulsi Das"), new int[]{3231},Topic.HINDUISM,Year.of(1950),25.0);
		library.add(b);
		
		
		b = new Book("Hanuman Chalisa",Arrays.asList( "Tulsi Das"), new int[]{12},Topic.HINDUISM,Year.of(1950),3.0);
		library.add(b);
		
		
		b = new Book("Mastering Lambdas",Arrays.asList( "Maurice Naftaline"), new int[]{178},Topic.PROGRAMMING,Year.of(2015),20.0);
		library.add(b);
		
		b = new Book("OCJP 1.8",Arrays.asList( "Khalid Mughal"), new int[]{690},Topic.PROGRAMMING,Year.of(2017),25.0);
		library.add(b);
		
		b = new Book("Chacha Chaudhary",Arrays.asList( "Pintu"), new int[]{25},Topic.HINDUISM,Year.of(2016),17.0);
		library.add(b);
		
		
		
		
	}
	
}
