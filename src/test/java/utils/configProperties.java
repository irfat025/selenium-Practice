package utils;

import java.util.Properties;
import java.io.*;
import Common.BaseTest;

public class configProperties {

	public Properties config = new Properties();
	private final String propertyFilePath = BaseTest.resourceRoot+"config.properties";
	
	//public final String propertyFilePath ="D:\\ecliips workspace\\testngPractise\\src\\main\\resources\\config.properties";
	File file;
	
	public configProperties() throws IOException
	{
		file= new File(propertyFilePath);
		FileInputStream fileInputStream = new FileInputStream(file);
		config.load(fileInputStream);
	}
	
}
