package com.ajc.app.model;

import java.io.File;

public class FileWalker {

		
		private static int depth = 0;
		
		public void displayDir(String path) {
			String spaces = "";
			depth++;
			
			File folder = new File(path);
			File[] content =  folder.listFiles();
			
			for (int i = 0; i < depth-1; i++) {
				spaces+=" ";
			}
			for (File file : content) {
				if(file.isDirectory()) {
					System.out.println(spaces + file.getName());
					displayDir(file.getAbsolutePath());
				}else {
					System.out.println(spaces + file.getName());
				}
			}
			depth--;
		}

}
