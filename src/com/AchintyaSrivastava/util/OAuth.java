package com.AchintyaSrivastava.util;
import java.io.*;



import oauth.signpost.basic.DefaultOAuthConsumer;

import java.net.*;



import org.codehaus.jackson.map.ObjectMapper;

import com.AchintyaSrivastava.bean.Marketplace;
import com.AchintyaSrivastava.bean.Parent_main;

public class OAuth {
	    public static Parent_main Sign(String myurl) {

	    String str= "";

	    try {

	        DefaultOAuthConsumer e = new DefaultOAuthConsumer("tech-dragan-ball-153870", "nlRHGdRAcdr4ojCH");

	            URL url = new URL(myurl);
	            
	            HttpURLConnection request = (HttpURLConnection)url.openConnection();

	            request.setRequestProperty("Accept", "application/json");

	            e.sign(request);


	            System.out.println(".....Sending GET request to URL.... : " +myurl);


	            BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream()));


	            String line="";


	            while((line = in.readLine())!=null)

	            {

	            //System.out.println(line);

	            str= str+line;

	            }
	            System.out.println("str is "+str);
	            ObjectMapper om = new ObjectMapper();

	            Parent_main p = om.readValue(str,Parent_main.class);

	            Marketplace mp = p.getMarketplace();

	            System.out.println(mp.getBaseUrl());
	            
	          
		        return new Jsonmap().jsonmap(str);


	        }

	        catch (Exception e) {

	        e.printStackTrace();

	        }

	        return new Jsonmap().jsonmap(str);

	    }

	}




