public class Link
{
	/*
	 * This is where we define the link and this is where we define the next and
	 * prev node obviously first node prev = null last node next = null
	 */

	private Link next;
	private Link prev;
	private String BookName;
	private String MillionCopies;

	/**
	 * @return the next
	 */
	public Link getNext()
	{
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(Link next)
	{
		this.next = next;
	}

	/**
	 * @return the prev
	 */
	public Link getPrev()
	{
		return prev;
	}

	/**
	 * @param prev
	 *            the prev to set
	 */
	public void setPrev(Link prev)
	{
		this.prev = prev;
	}

	/**
	 * @return the bookName
	 */
	public String getBookName()
	{
		return BookName;
	}

	/**
	 * @param bookName
	 *            the bookName to set
	 */
	public void setBookName(String bookName)
	{
		BookName = bookName;
	}

	/**
	 * @return the millionCopies
	 */
	public String getMillionCopies()
	{
		return MillionCopies;
	}

	/**
	 * @param millionCopies
	 *            the millionCopies to set
	 */
	public void setMillionCopies(String millionCopies)
	{
		MillionCopies = millionCopies;
	}

	/*
	 * this is the default constructor
	 */
	public Link()
	{
		// TODO Auto-generated constructor stub
	}

	/*
	 * This is the constructor defined with parameters
	 */

	public Link(String bookname, String millionsofcopies)
	{
		this.setBookName(bookname);
		this.setMillionCopies(millionsofcopies);
	}

	public void Display()
	{
		System.out.println("Book " + this.getBookName() + " sold "
				+ this.getMillionCopies() + "000,000 copies");
	}
}
