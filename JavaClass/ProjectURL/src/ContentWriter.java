import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ContentWriter {
	public static void createNewFile() throws IOException{

	String dirString = "c:/Users/Fouzia/JavaClass/ProjectURL/src"; 
	Path dirPath = Paths.get(dirString); 
	if (Files.notExists(dirPath)){
		Files.createDirectories(dirPath); 
	}
	String fileString = "ProjectStuffHTML";
	Path filePath = Paths.get(dirString, fileString); 
	if (Files.notExists(filePath)){
		Files.createFile(filePath); 
	}
	

	}
	public static void writeUrlContentIntoProjectStuffHTML (String content) throws IOException {
		createNewFile();
		BufferedWriter bufferWriter = new BufferedWriter(new FileWriter("src/ProjectStuffHTML", true));
		bufferWriter.write(content);
		bufferWriter.close();
		
		
	}
}
