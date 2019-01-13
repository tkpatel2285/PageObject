package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PageLoadOut
{
   static Properties prop;
    static FileInputStream input;
    static String filename = "TestDataConfig.properties";
    static String fileLocation = "src\\test\\Resources";
    public String getProperty(String key)
    {
     prop = new Properties();
     try{
         input=new FileInputStream("config.properties" + "src\\test\\Resources\\config.properties");

        } catch (FileNotFoundException e) {
         e.printStackTrace();
        }
            return prop.getProperty(key);
        }

}
