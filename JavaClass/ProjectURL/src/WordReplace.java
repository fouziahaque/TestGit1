
public class WordReplace {
	public static String wordReplace(String content){
		String editedContent = "";
		
		editedContent = content.replaceAll("America", "<mark> NeverLand <mark>"); 
		editedContent = content.replaceAll("George", "<mark> Fouzia</mark>"); 
		
		
		return editedContent; 
		
	}

}
