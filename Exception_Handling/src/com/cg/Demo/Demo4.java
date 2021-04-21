package com.cg.Demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo4 {
	public static void main(String[] args) {
		FileReader fr=null;
		try {
			fr.read();
		// fist should handle subclass exception then superclass	
		}catch(FileNotFoundException ex) {
			//fr.close();
		}catch(IOException ex) {
			//fr.close();
		}catch(IllegalArgumentException ex) {
			//fr.close();
		}catch(Exception ex) {
			//fr.close();
		}finally {
			//fr.close();
		}
	}


}
