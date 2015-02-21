import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class InterestingDigits {
	
	public int[] digits(int base) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int d=2; d<base; d++) {
            boolean failed = false;
            int n = 0;
            int k = 1;
            while (true) {
                n = k * d;
                if (n >= Math.pow(base, 3)){
                    break;
                }

                k++;

                int basesq = base * base;
                int sum = (n % base) + ((n / base) % base) + ((n / basesq) % base);
                if (sum % d != 0) {
                    failed = true;
                    break;
                }
            }

            if (!failed) {
                result.add(d);
            }
        }

        int[] r = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            r[i] = result.get(i);
        }

        return r;
	}
}
