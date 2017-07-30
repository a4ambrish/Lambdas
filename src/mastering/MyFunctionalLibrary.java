package mastering;
 import static mastering.MyLibrary.library;

import java.util.Comparator;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import mastering.modal.Book;
import mastering.modal.Topic;;
public class MyFunctionalLibrary {

	
	// A Stream <Book> that contains computing books = 
	public Stream<Book> computingBook = library.stream().filter(b-> b.getTopic() == Topic.COMPUTING);
	
	// A streams  of book titles..
	public Stream<String> bookTitles = library.stream().map(Book::getTitle);
	
	// straem of books , sorted by title
	public Stream<Book> booksSortedByTitle = library.stream().sorted(Comparator.comparing(Book::getTitle));
	
	// Use this sorted stream to create of stream of authors in order of book title, with duplicates removed 
	public Stream<String> authorsInBookTitleOrder = library.stream().sorted(Comparator.comparing(Book::getTitle)).flatMap(book->book.getAuthors().stream()).distinct();
	
	// A stream yielding the first 100 books in alphabetical oder of title.
	public Stream<Book> readingList = library.stream().sorted(Comparator.comparing(Book::getTitle)).limit(100);
	
	// A stream with the rest
	public 	Stream<Book> remainderList = library.stream().sorted(Comparator.comparing(Book::getTitle)).skip(100);
	
	// Ther erliest published book in my library
	public Optional<Book> oldest = library.stream().min(Comparator.comparing(Book::getPubDate));
	
	// the set of the titles of the book in my library
	public Set<String> titles = library.stream().map(Book::getTitle).collect(Collectors.toSet());
	
	
}
