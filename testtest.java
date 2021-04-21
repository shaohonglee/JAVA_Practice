import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class testtest {

	public static void main(String[] args) {
		File file = new File("D:/pycode/doc1/02_服務參數對應表_FEP_increaseATMcash.docx");
        try {
            
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

	}

}
