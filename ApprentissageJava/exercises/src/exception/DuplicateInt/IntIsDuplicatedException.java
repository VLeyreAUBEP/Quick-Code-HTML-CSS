package exception.DuplicateInt;

public class IntIsDuplicatedException extends Exception{
	private static final long serialVersionUID = 1L;
	private String message;
	public IntIsDuplicatedException(final String message) {
		super(message);
	}
	public String getDuplicateMessage() {
		return message;
	}
}
