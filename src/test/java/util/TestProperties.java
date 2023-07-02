package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import Configurations.Constants;

public class TestProperties {

	
	public static Properties GetProperties() throws IOException {
		 Properties prop = new Properties();
		 FileInputStream fis = new FileInputStream(Constants.Property_File_Path);
		 prop.load(fis);
		 return prop;
		 
	}
}
