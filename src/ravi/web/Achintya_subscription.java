package ravi.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.AchintyaSrivastava.bean.Marketplace;
import com.AchintyaSrivastava.bean.Parent_main;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;
import ravi.model.Model_WiseProducts;
import ravi.model.User;
import java.io.*;

/**
 * Servlet implementation class Achintya_subscription
 */
@WebServlet("/Achintya_subscription")
public class Achintya_subscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String str;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        ObjectMapper mapper = new ObjectMapper();
        String eventUrl= (String) request.getParameter("eventUrl");
        
        Model_WiseProducts m= new Model_WiseProducts(true,"Achintya");
        //m.setSuccess(true);
        //m.setAccountIdentifier("Achintya");
      //  ResponseSuccess responseObject= new ResponseSucess(true,"new-account-modifier");
        String json = mapper.writeValueAsString(m);
        out.print(json);
        System.out.println(eventUrl);
        
        
        
        OAuthConsumer consumer = new DefaultOAuthConsumer("tech-dragan-ball-153870", "nlRHGdRAcdr4ojCH");
        URL url = new URL(eventUrl);
        HttpURLConnection requestres = (HttpURLConnection) url.openConnection();
		requestres.setRequestProperty("Accept", "application/json");
        try
        {
        consumer.sign(requestres);
        
        requestres.connect();
	}catch(Exception e)
        {
		e.printStackTrace();
        }
        
        BufferedReader f = new BufferedReader(new InputStreamReader(requestres.getInputStream()));
        String last="";
        String str="";
        while((last=f.readLine())!=null)
        {
        	//System.out.println(last);
        	str=str+last;
        }
        System.out.println("str is "+str);
        ObjectMapper om = new ObjectMapper();

        Parent_main p = om.readValue(str,Parent_main.class);


        //System.out.println("*********");

        //System.out.println(p);


        Marketplace mp = p.getMarketplace();

        System.out.println(mp.getBaseUrl());
	}

}
