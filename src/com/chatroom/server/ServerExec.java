package com.chatroom.server;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import com.chatroom.Database.createdb;
import com.chatroom.configuration.Config;
import com.chatroom.others.LogFileWriter;

public class ServerExec {

	public static void main(String[] args) {
		//create the log file if it is not present
		String path = System.getProperty("user.home");
		path += "/CHATROOM";
		File file = new File(path);
		if(!file.exists())
			file.mkdir();
				
		File f = new File(System.getProperty("user.home")+"/CHATROOM/LOGS.txt");
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace(new PrintWriter(Config.errors));
				LogFileWriter.Log(Config.errors.toString());
			}
		}

		
		new createdb();

		Server server = new Server(Config.port);
		server.connect();
	}
}
