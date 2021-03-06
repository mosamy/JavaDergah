/**
 * 
 */

/**
 * @author mohamed samy
 *
 */
public class DoublyLinkedList
{

	private Link firstLink;
	private boolean isEmpty = true;

	/**
	 * constructor
	 */
	public DoublyLinkedList()
	{

	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		DoublyLinkedList DL = new DoublyLinkedList();
		DL.AddLink(new Link("Mohamed", "4"));
		DL.AddLink(new Link("Natalie", "5"));
		DL.Display();
	}

	/*
	 * no method should return nothing
	 */
	public boolean AddLink(Link link)
	{
		try
		{
			if (isEmpty == true)
			{
				this.firstLink = link;
				this.firstLink.setPrev(null);
				this.firstLink.setNext(null);
				isEmpty = false;
			}
			link.setNext(firstLink);
			link.setPrev(null);
			firstLink.setPrev(link);
			firstLink.setNext(null);
			this.firstLink = link;
			return true;
		} catch (Exception ex)
		{
			return false;
		}
	}

	public boolean Display()
	{
		Link startLink = firstLink;
		while (startLink != null)
		{
			startLink.Display();
			startLink = startLink.getNext();
		}
		return true;
	}

}
