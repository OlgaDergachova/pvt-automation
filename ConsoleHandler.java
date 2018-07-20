import java.util.Scanner;

import text.TextUtil;

public class ConsoleHandler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter text: ");
		String text = sc.nextLine();

		while ("".equals(text) || " ".equals(text)) {
			System.out.println("Incorrect! Enter text again: ");
			text = sc.nextLine();
		}

		System.out.println("Enter source e.g. src/test_read.txt: ");
		String fileName = sc.nextLine();

		System.out.println("Enter number of symbol: ");
		int symbol = sc.nextInt();

		while (symbol < 1) {
			System.out.println("Incorrect! Enter number of symbol again: ");
			symbol = sc.nextInt();
		}

		System.out.println("****TEXT FROM CONSOLE****: ");
		TextUtil.modifyText(text, symbol);

		System.out.println("****TEXT FROM FILE****: ");
		TextUtil.modifyText(TextUtil.readText(fileName), symbol);
	}
}
