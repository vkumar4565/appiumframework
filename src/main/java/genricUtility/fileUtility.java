package genricUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class fileUtility {

    public static String getProperty(String key) throws IOException {
        FileInputStream file = new FileInputStream("src/main/resources/config.property");
        Properties prop = new Properties();
        prop.load(file);
        String value = prop.getProperty(key);
        return value;
    }
}
