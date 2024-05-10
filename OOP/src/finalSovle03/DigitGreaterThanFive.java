package finalSovle03;

public class DigitGreaterThanFive {
	public int countDigitsGreaterThanFive(int num) {
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit > 5) {
                count++;
            }
            num = num/10;
        }
        return count;
    }
}
