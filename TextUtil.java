package text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextUtil {

	public static void modifyText(String text, int symbol) {
		TextElements paragraph = new Paragraph(text);

		String[] sentElements = paragraph.divideTextElement();
		String[] modifiedSentElements = new String[sentElements.length];

		for (int k = 0; k < sentElements.length; k++) {
			TextElements sentence = new Sentence(sentElements[k]);

			String[] wordElements = sentence.divideTextElement();
			String[] modifiedWordElements = new String[wordElements.length];

			for (int i = 0; i < wordElements.length; i++) {
				TextElements word = new Word(wordElements[i]);
				((Word) word).replaceWithPercentage(symbol);
				modifiedWordElements[i] = word.getElement();
				System.out.println("Word: " + modifiedWordElements[i]);
			}

			sentence.appendElements(modifiedWordElements);
			modifiedSentElements[k] = sentence.getElement();
			System.out.println("Sentence: " + modifiedSentElements[k]);

		}

		paragraph.appendElements(modifiedSentElements);
		System.out.println("Paragraph: " + paragraph.getElement());
	}

	public static String readText(String fileName) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(fileName));
			return reader.readLine();
		} catch (IOException e) {
			System.out.println("No such file or directory :(");
		}

		return "No text :(. Ok. Let's parse this sentence.";
	}

	// overloaded method with default source
	public static String readText() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("src/test_read.txt"));
			return reader.readLine();
		} catch (IOException e) {
			System.out.println("No such file or directory :(");
		}

		return "No text :(. Ok. Let's parse this sentence.";
	}
}
