package interfaces.searchable;

public class WebPage implements Searchable{
	private String url;
	private String htmlContent;
	
	public WebPage (final String url, final String htmlContent) {
		this.url = url;
		this.htmlContent = htmlContent;
	}
	
	public boolean search(final String keyword) { 
		return url.contains(keyword) || htmlContent.contains(keyword);
	}
	
}
