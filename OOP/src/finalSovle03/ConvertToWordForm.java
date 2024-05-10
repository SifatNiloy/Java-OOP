package finalSovle03;

public class ConvertToWordForm {
	public String convertToWordForm(int num) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringBuilder wordForm = new StringBuilder();
        while (num != 0) {
            int digit = num % 10;
            wordForm.insert(0, words[digit] + " ");
            num = num/10;
        }
        return wordForm.toString().trim();
    }
}
