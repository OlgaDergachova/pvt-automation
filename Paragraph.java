package text;

import static text.TextSpecialElements.sentence_devider;
import static text.TextSpecialElements.space;

public class Paragraph extends TextElements {

	public Paragraph(String paragraph) {
		super(paragraph);
	}

	@Override
	public String[] divideTextElement() {
		return getElement().split(sentence_devider);
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
		setElement(stringBuilder.toString());
	}
}
