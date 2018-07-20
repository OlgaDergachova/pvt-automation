package text;

import static text.TextSpecialElements.percentage;

public class Word extends TextElements {

	public Word(String word) {
		super(word);
	}

	public void replaceWithPercentage(int numberOfSymbol) {
		String[] symbols = divideTextElement();
		if (symbols.length > numberOfSymbol - 1) {
			symbols[numberOfSymbol - 1] = String.valueOf(percentage);
		}
		appendElements(symbols);
	}

	@Override
	public String[] divideTextElement() {
		String[] sym = new String[getElement().length()];

		for (int i = 0; i < getElement().length(); i++) {
			sym[i] = String.valueOf(getElement().charAt(i));
		}
		return sym;
	}

	@Override
	public void appendElements(String[] elements) {
		StringBuilder stringBuilder = new StringBuilder();

		for (String element : elements) {
			stringBuilder.append(element);
		}
		setElement(stringBuilder.toString());
	}
}
