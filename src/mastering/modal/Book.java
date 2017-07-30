package mastering.modal;

import java.io.Serializable;
import java.time.Year;
import java.util.Arrays;
import java.util.List;

public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String title;
	List<String> authors;
	int[] pageCounts;
	Topic topic;
	Year pubDate;
	double height;

	
	
	public Book(String title, List<String> authors, int[] pageCounts, Topic topic, Year pubDate, double height) {
		super();
		this.title = title;
		this.authors = authors;
		this.pageCounts = pageCounts;
		this.topic = topic;
		this.pubDate = pubDate;
		this.height = height;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public int[] getPageCounts() {
		return pageCounts;
	}

	public void setPageCounts(int[] pageCounts) {
		this.pageCounts = pageCounts;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Year getPubDate() {
		return pubDate;
	}

	public void setPubDate(Year pubDate) {
		this.pubDate = pubDate;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", authors=" + authors + ", pageCounts=" + Arrays.toString(pageCounts)
				+ ", topic=" + topic + ", pubDate=" + pubDate + ", height=" + height + "]";
	}

}
