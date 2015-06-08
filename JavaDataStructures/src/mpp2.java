import java.util.Arrays;
import java.util.List;

public class mpp2
{

	public mpp2()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] Args)
	{
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		integers.forEach(x -> System.out.println(x));

		// Float f = (Float) 1.00f / 0;
		// System.out.print(f);

		int k = 0;
		int m = 3 * ++k; // m equals 0, k equals 1
		System.out.print(m);

		// int k = 0;
		int n = 3 * ++k; // n equals 3, k equals 1
	}
}
