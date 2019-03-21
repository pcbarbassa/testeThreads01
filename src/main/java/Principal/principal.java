package Principal;

import java.sql.Array;

public class principal {
		public static void main(String[] args) {
			int[] array = {1,2,3,4,5};
			minhaThreadSoma t1 = new minhaThreadSoma("#1", array);
			minhaThreadSoma t2 = new minhaThreadSoma("#2", array);
		}

}
