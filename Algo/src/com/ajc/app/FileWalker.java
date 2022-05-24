package com.ajc.app;

import java.io.File;

public class FileWalker {

	
	private static int depth = 0;
	
	public void displayDir(String path) {
		depth++;
		File folder = new File(path);
		File[] content = folder.listFiles();
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = 0; i < depth - 1; i++) {
			sb.append("\t");
		}
		
		for (File file: content) {
			if(file.isDirectory()) {
				displayDir(file.getAbsolutePath());
			}
			sb.append(file.getName());
		}
		System.out.println(sb);
	}
	

}
