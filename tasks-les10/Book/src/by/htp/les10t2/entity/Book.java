package by.htp.les10t2.entity;

public class Book {

	private int id;
	private String name;
	private String author;
	private String publisher;
	private int year;
	private int page;
	private int price;
	private String coverType;

	public Book() {

		this.id = 1;
		this.name = "Анастасия";
		this.author = "N";
		this.publisher = "Эксмо";
		this.year = 2022;
		this.page = 222;
		this.price = 200;
		this.coverType = "Твердый переплет";
	}

	public Book(int id, String name, String author, String publisher, int year, int page, int price, String coverType) {

		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.page = page;
		this.price = price;
		this.coverType = coverType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCoverType() {
		return coverType;
	}

	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((coverType == null) ? 0 : coverType.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + page;
		result = prime * result + price;
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (coverType == null) {
			if (other.coverType != null)
				return false;
		} else if (!coverType.equals(other.coverType))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (page != other.page)
			return false;
		if (price != other.price)
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id = " + id + ", name = " + name + ", author = " + author + ", publisher = " + publisher
				+ ", year = " + year + ", page = " + page + ", price = " + price + ", coverType = " + coverType + "]";
	}
}
