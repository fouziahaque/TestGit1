import java.io.IOException;

public class UrlConnectionApp {
	//added this comment

	public static void main(String[] args) throws IOException {
		String output = ContentReader.getUrlContents("http://www.history.com/topics/constitution");
		ContentWriter.writeUrlContentIntoProjectStuffHTML(output);
		
	}

	
}
