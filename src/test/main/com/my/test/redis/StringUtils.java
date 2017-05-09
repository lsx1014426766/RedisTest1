package com.my.test.redis;

public class StringUtils {
	/**
	 * 转化为int
	 * @param s
	 * @return
	 */
  public static Integer getInt(String s){
	  if(s==null||"".equals(s.trim())){
		  return null;
	  }
	  return Integer.parseInt(s.trim());
  }
  public static Long getLong(String s){
	  if(s==null||"".equals(s.trim())){
		  return null;
	  }
	  return Long.parseLong(s.trim());
  }
  public static Boolean getBoolean(String s){
	  if(s==null||"".equals(s.trim())){
		  return null;
	  }
	  return Boolean.parseBoolean(s.trim());
  }
}
