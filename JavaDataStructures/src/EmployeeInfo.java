import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo
{

	private static List<Employee> emp = new ArrayList<Employee>();

	public EmployeeInfo()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		//
		// List<String> unsortList = new ArrayList<String>();
		//
		// unsortList.add("CCC");
		// unsortList.add("111");
		// unsortList.add("AAA");
		// unsortList.add("BBB");
		// unsortList.add("ccc");
		// unsortList.add("bbb");
		// unsortList.add("aaa");
		// unsortList.add("333");
		// unsortList.add("222");
		//
		// // before sort
		// System.out.println("ArrayList is unsort");
		// for (String temp : unsortList)
		// {
		// System.out.println(temp);
		// }
		//
		// // sort the list
		// Collections.sort(unsortList);
		// // Collections.sort(unsortList);
		//
		// // after sorted
		// System.out.println("ArrayList is sorted");
		// for (String temp : unsortList)
		// {
		// System.out.println(temp);
		// }

		List<Employee> unsorted = new ArrayList<Employee>();
		unsorted.add(new Employee("Mohamed", "Samy", 10000.00));
		unsorted.add(new Employee("Mohamed", "Ali", 9000.00));
		unsorted.add(new Employee("Mohamed", "Samy", 12000.00));
		unsorted.add(new Employee("Mohamed", "Samy", 15000.00));

		System.out.println("unSorted");
		for (Employee employee : unsorted)
		{
			System.out.println(employee);
		}

		Collections.sort(unsorted);

		System.out.println("Sorted");
		for (Employee employee : unsorted)
		{
			System.out.println(employee);
		}
	}

}
