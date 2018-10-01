package config; 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import PropertyFiles.SeleniumTest;

public class PropertyFile {
	static Properties prop = new Properties();
	public static void main(String[] args) throws IOException {
		
		readPropertiesFile();
		writePropertiesFile();
		readPropertiesFile();
	}

	 	 public static void readPropertiesFile() throws IOException{
	 		
	 		 InputStream input=new FileInputStream("D:/Qedge/ReusableMethod/src/config/config.properties");
	 		prop.load(input); 
	 		System.out.println(prop.getProperty("browser"));
	 		SeleniumTest.browser=prop.getProperty("browser");
	 		System.out.println(SeleniumTest.browser);
	 		
	 	 }
	 	 public static void writePropertiesFile() throws IOException{
	 		 OutputStream output=new FileOutputStream("D:/Qedge/ReusableMethod/src/config/config.properties");
	 		 prop.setProperty("browser", "chrome");
	 		 prop.setProperty("Result", "pass");
	 		 prop.store(output, null);
	 		 
	 	 }
	}

 
