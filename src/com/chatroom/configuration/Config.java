package com.chatroom.configuration;

import java.awt.Color;
import java.io.StringWriter;

public class Config {
	public static String USER_NAME  = "root";
	public static String USER_PWD = "";
	public static String DATABASE_HOST = "localhost";
	public static String DATABASE_URL = "jdbc:mysql://";
	public static String DATABASE_PORT = ":3306";
	public static final String DATABASE_NAME = "chatroom";
	public static final String TABLE_NAME = "users";
	public static final String CLIENT_ID = "client_id";
	public static final String CLIENT_NAME = "client_name";
	public static final String CLIENT_PWD = "client_pwd";
	public static final Color colorPrimary = new Color(1,125, 49);
        public static final int port= 3393;
	public static StringWriter errors = new StringWriter();
}
