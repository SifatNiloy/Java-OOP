package finalSovle03;

public class EvenDigits {
	public int countEvenDigits(int num) {
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
