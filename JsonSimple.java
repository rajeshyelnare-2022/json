package com.yelnare.rajesh;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class JsonSimple {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		 JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("c:/junk/j.txt"));
		JSONObject jsonObject = (JSONObject) obj;
		 System.out.println("jsonObject = " + jsonObject);
	      System.out.println("age = "+(Long) jsonObject.get("age"));
	}

}
