package step_definations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	public static Properties prop;
	
	public static void main(String[] args) throws IOException {
	
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\User\\Desktop\\eclipse\\CapitalOne"
				+ "\\src\\test\\testData\\config.properties");
		prop.load(ip);
	}
	catch(FileNotFoundException e){
		e.printStackTrace();
	}
	catch (IOException e) {
		e.printStackTrace();
	}
	}
}

