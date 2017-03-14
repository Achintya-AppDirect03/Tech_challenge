package com.AchintyaSrivastava.util;
import org.codehaus.jackson.map.ObjectMapper;

import com.AchintyaSrivastava.bean.Parent_main;

public class Jsonmap {
	


	public Parent_main jsonmap(String str)

	{

	ObjectMapper om = new ObjectMapper();

	Parent_main p = new Parent_main();


	try

	{

	    p=om.readValue(str, Parent_main.class);

	}

	catch(Exception e)

	{

	e.printStackTrace();

	}

	return p;



	}



	
}
