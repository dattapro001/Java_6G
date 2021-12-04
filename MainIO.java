import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
public class MainIO {
	
    // Read From Keyboard 
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		int a = Integer.parseInt(br.readLine());
		String str = br.readLine();
		System.out.println(a);
		System.out.println(str);
	
	
	//Read From File
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\User\\eclipse-workspace\\MainIO\\MainIO.txt");
		FileReader filereader = new FileReader(file);
		BufferedReader br = new BufferedReader(filereader);
		String str = br.readLine();
		System.out.println(str);
	
	
	//Read Every line From File
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\MainIO.txt");
		FileReader Filereader = new FileReader(file);
		BufferedReader br = new BufferedReader(Filereader);
		while(br.readLine()!=null) {
			String str = br.readLine();
			System.out.println(str);
		}
	}

}
