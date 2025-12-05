package interfaces.searchable;

public class MainSearchable {
	public static void main(String[] args) {
		Document document = new Document("Ceci est un texte de document.");
		WebPage webpage = new WebPage("httls://urlWebpage.com", "Ceci est du faux contenu HTML");
		
		System.out.println("Le " + document.getClass().getSimpleName().toLowerCase() + " contient-il le mot document ? " + document.search("document"));
		System.out.println("Le " + webpage.getClass().getSimpleName().toLowerCase() + " contient-il le mot url et/ou le mot HTML dans son url/contenu HTML ? url : " + webpage.search("url") + " HTML : " + webpage.search("HTML"));
	}
}
