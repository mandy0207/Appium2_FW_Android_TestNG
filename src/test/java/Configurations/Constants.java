package Configurations;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Constants {
	
	public static final String WORKING_DIRECTORY = System.getProperty("user.dir");
	public static final String Property_File_Path= System.getProperty("user.dir")+"/config.properties";
	
	
	public final static String EXTENT_CONFIG_PATH = WORKING_DIRECTORY+"/src/test/resources/config/extent-config.xml";
			
	
	public final static String REPORT_DIRECTORY = WORKING_DIRECTORY+"/Reports/AutomationResult.html";
			
	
	//public final static String REPORT_DIRECTORY = WORKING_DIRECTORY+"/Reports/index.html";

	public final static String API_DEMO_app = 	"C:\\Sask\\Code\\workspace\\AndroidAppiumFW\\src\\test\\java\\resources\\ApiDemos-debug.apk";
    
	public final static String General_Store_app= "C:\\Sask\\Code\\workspace\\AndroidAppiumFW\\src\\test\\java\\resources\\General-Store.apk";
	
	public final static String PROJECT_NAME = "Flaming Mafia";	
	
	/** The Constant REPORT_DIRECTORY. */
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	
	public static String getTimestamp() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());

		return sdf.format(timestamp);
	}
	
}
