package text;

import static text.TextSpecialElements.dot;
import static text.TextSpecialElements.space;

public class Sentence extends TextElements {

	public Sentence(String sentence) {
		super(sentence);
	}

	@Override
	public String[] divideTextElement() {
		return getElement().trim().split(space);
	}

	@Override
	public void appendElements(String[] elements) {
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < elements.length; i++) {
			stringBuilder.append(elements[i]);
			if (i != elements.length - 1) {
				stringBuilder.append(space);
			}
		}

		setElement(stringBuilder.append(dot).toString());
	}
}
