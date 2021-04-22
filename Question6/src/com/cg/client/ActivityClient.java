package com.cg.client;

import com.cg.beans.Activity;
import com.cg.beans.ActivityInfo;

public class ActivityClient {
	public static void main(String[] args) {
		Activity obj = new Activity(null,null,"-");
		ActivityInfo info = new ActivityInfo();
		System.out.println(info.doOperation(obj));
		System.out.println(info.handleException(obj));
		
		
		
	}
}
