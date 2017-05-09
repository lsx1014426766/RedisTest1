package com.my.test.redis;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

public class PropertyConfig {

	public static final String module = PropertyConfig.class.getName();
	private static Map<String, ResourceBundle> configs = new HashMap<String, ResourceBundle>();
	private static Logger logger = Logger.getLogger(PropertyConfig.class);
	public static final String redis = "com.my.test.redis.redis";

	
	/**
	 * get value from different file
	 * @param fileName
	 * @param key
	 * @return
	 */
	public static String getProperty(String fileName, String key){
//		logger.info("getProperty begin");
		String result = "";
		
	    try {
	    	if (fileName == null || "".equals(fileName)) {
	    		logger.warn("file name is blank!");
	    		return result;
	    	}
	    	
	    	if (key == null || "".equals(key)) {
	    		logger.warn("key is blank!");
				return result;
			}
	    	
	    	if (configs.get(fileName) == null)
	    		configs.put(fileName, ResourceBundle.getBundle(fileName, Locale.getDefault()));
	    	
	    	result =  configs.get(fileName).getString(key);
	    	
	    } catch (MissingResourceException e) {
	    	logger.error("properties file :" + fileName + " is not exists or key :" + key + " is missing!");
//    		result =  '!' + key + '!';
	    }
	    
	    logger.info("key = " + key + ", file =" + fileName);
//		logger.info("getProperty end");
		return result;
	}

	public static void main(String args[]){
		String a=PropertyConfig.getProperty(redis,"redis.pool.maxActive");
		//System.out.println(a);
		System.out.println(a);
	}

}
