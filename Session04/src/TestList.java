import java.util.ArrayList;

public class TestList {
	
	public static void main(String[] args) {
		ArrayList a = new ArrayList(1000);
		long t0 = System.currentTimeMillis();
		for (long i = 0; i < 20000000000L; i++)
			;
		long t1 = System.currentTimeMillis();
		System.out.println(t1-t0);
	}
}
