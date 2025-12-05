package interfaces.searchable;

public class Document implements Searchable{
	private String content;
	
	public Document(final String content) {
		this.content = content;
	}
	
	public boolean search(final String keyword) {
		return content.contains(keyword);
	}

}
