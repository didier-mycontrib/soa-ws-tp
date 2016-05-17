package tp.client.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * @author formation
 * 
 * Classe utilitaire MyPropertiesUtil
 * 
 * Utilisation:
 * java.util.Properties props = MyPropertiesUtil.loadProperties("wsUrl.properties");
 * String wsdlUrlAsString = props.getProperty("wsdl.url");
 *
 */

public class MyPropertiesUtil {
	
	public static Properties loadProperties(String propFileName /* relatif au classpath */){
		Properties props = new Properties();
		try {
			InputStream is= Thread.currentThread().getContextClassLoader().getResourceAsStream(propFileName);
			props.load(is);
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage(),e);
		}
		return props;
	}
	
}
