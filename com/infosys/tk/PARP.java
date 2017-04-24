package com.javaweb.chat;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ParseProperties {
	/**
	 * 根据属性文件的key读取对应的value值。
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public static String readProperties(String key) throws IOException{
		Properties prop = new Properties();
		InputStream is = ParseProperties.class.getClassLoader().getResourceAsStream("db.properties");
		prop.load(is);
		return prop.getProperty(key);
	}
	/**
	 * 根据用户名密码进行登录。
	 * @param key
	 * @param value
	 * @return
	 * @throws IOException 
	 */
	public static boolean checkLogin(String key, String value) throws IOException{
		//从数据库中找出用户名和密码
		String user = readProperties("username");
		String password = readProperties("password");
		if (key.equals(user) && value.equals(password)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
//		String path = FileUtils.class.getClassLoader().getResource("").getPath();
//		System.out.println(path);
		String str = readProperties("password");
		System.out.println(str);
	}
}
