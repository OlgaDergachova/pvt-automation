package text;

public abstract class TextElements {

	private String element;

	public TextElements(String element) {
		this.element = element;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public abstract String[] divideTextElement();

	public abstract void appendElements(String[] elements);

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		TextElements that = (TextElements) o;

		return element != null ? element.equals(that.element) : that.element == null;
	}

	@Override
	public int hashCode() {
		return element != null ? element.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "TextElements{" + "element='" + element + '\'' + '}';
	}
}
