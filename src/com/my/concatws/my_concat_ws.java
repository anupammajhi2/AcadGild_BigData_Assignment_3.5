package com.my.concatws;

import org.apache.hadoop.hive.ql.exec.UDF;

public class my_concat_ws extends UDF{
	public static String evaluate(String sep, String[] arrayOfStrings) {
		String joined_String = new String();
		if(sep == null || arrayOfStrings == null) {
			return null;
		}
		
		for(int i=0; i < arrayOfStrings.length; i++) {
			joined_String += arrayOfStrings[i];
		}
		
		return joined_String;
	}
}
