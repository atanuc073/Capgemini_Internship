package com.cg.Demo;

import java.io.FileReader;

public class Demo5 {
	public static void main(String[] args) {

		try (FileReader fr =new FileReader("abc.txt")){
			// it automaticaly close the stream.
		}catch(Exception ex){
			
			
		}
	}

}
