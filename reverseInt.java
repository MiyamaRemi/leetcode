package leetcode;

import java.util.Scanner;

public class reverseInt {
	
	public reverseInt() {
		
	}

	public int reverse(int x) {
		int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || 
                (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || 
                (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
   }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		reverseInt rever = new reverseInt();
		scan.close();
		int result = rever.reverse(x);
		System.out.println(result);
	}
}
