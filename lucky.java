import java.util.Scanner;
public class NearlyLucky {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long lInput = input.nextLong();
		if (lInput > 0 && isLuckyNumber(getNumberOfLucky("" + lInput))) System.out.println("YES");
		else System.out.println("NO");
	}
	
	public static String getNumberOfLucky(String input) {
		int nr = 0;
		for (int i = 0; i < input.length(); i++) {
			char myChar = input.charAt(i);
			if (myChar == '4' || myChar == '7') nr++;
		}
		return "" + nr;
	}
	
	public static boolean isLuckyNumber(String number) {
		for (int i = 0; i < number.length(); i++) {
			char myChar = number.charAt(i);
			if (myChar != '4' && myChar != '7') return false;
		}
		return true;
	}
	
	
}
