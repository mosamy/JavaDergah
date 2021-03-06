import java.util.HashMap;
import java.util.Iterator;

public class Employee implements Comparable
{
	private String firstName;
	private String lastName;
	private Double salary;
	private HashMap salaryRecord = new HashMap<String, Double>();

	public static void main(String[] args)
	{
		Employee Mohamed = new Employee();
		Mohamed.firstName = "Mohamed";
		Mohamed.lastName = "Samy";
		Mohamed.addEntry("1/1/2015", 100.00);
		Mohamed.addEntry("2/1/2015", 150.00);
		Mohamed.addEntry("3/1/2015", 200.00);
		Mohamed.printPaymentAmount("2/1/2015");
		Mohamed.printAveragePaycheck();

	}

	public Employee()
	{
		// TODO Auto-generated constructor stub
	}

	public Employee(String Firstname, String Lastname, Double Salary)
	{
		firstName = Firstname;
		lastName = Lastname;
		salary = Salary;
	}

	// methods

	public void addEntry(String date, Double paycheckAmount)
	{
		salaryRecord.put(date, paycheckAmount);
	}

	public void printPaymentAmount(String date)
	{
		Double salaryObject = (Double) salaryRecord.get(date);

		if (salaryObject != null)
		{
			System.out.println("The salary for " + firstName + " " + lastName
					+ " is " + salaryObject);
		} else
		{
			System.out.println(firstName + " " + lastName
					+ " was not paid a salary on " + date);
		}

	}

	public void printAveragePaycheck()
	{
		Iterator it = salaryRecord.keySet().iterator();
		Double sum = 0.0;
		int count = 0;
		// salaryRecord.
		while (it.hasNext())
		{
			String nextDate = (String) it.next();
			sum += (Double) salaryRecord.get(nextDate);
			count++;
		}

		System.out.println("The average salary of " + firstName + " "
				+ lastName + " is " + sum / count);
	}

	// properties
	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Object o)
	{
		// descending
		Double curr = ((Employee) o).getSalary();
		return (int) (curr - this.getSalary());
		// TODO Auto-generated method stub

	}

	@Override
	public String toString()
	{
		return "The Employee name is " + this.getFirstName() + " "
				+ this.getLastName() + " his Salary =  " + this.getSalary()
				+ " ";
	}

	/*
	 * @return the salary
	 */
	public Double getSalary()
	{
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(Double salary)
	{
		this.salary = salary;
	}

}
