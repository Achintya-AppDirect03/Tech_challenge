package com.AchintyaSrivastava.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.AchintyaSrivastava.DAO.DaoInsertTable;
import com.AchintyaSrivastava.bean.Parent_main;
import com.AchintyaSrivastava.domain.UserDetails;
import com.AchintyaSrivastava.model.DragonBallProduct;
import com.AchintyaSrivastava.services.CreateTableService;
import com.AchintyaSrivastava.util.Container;
import com.AchintyaSrivastava.util.OAuth;

import ravi.model.Model_WiseProducts;

/**
 * Servlet implementation class CreateSubscription
 */
@WebServlet("/CreateSubscription")
public class CreateSubscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateSubscription() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        ObjectMapper mapper = new ObjectMapper();
        String eventUrl= (String) request.getParameter("eventUrl");
        String myurl= request.getParameter("eventUrl");
        
        Parent_main pm=new OAuth().Sign(myurl);
        
        UserDetails ud=new UserDetails();

        
    DragonBallProduct m= new DragonBallProduct(true,ud.getAccountIdentifier());
        //m.setSuccess(true);
        //m.setAccountIdentifier("Achintya");
      //  ResponseSuccess responseObject= new ResponseSucess(true,"new-account-modifier");
        String json = mapper.writeValueAsString(m);
        out.print(json);
        System.out.println(eventUrl);
     
        // uncomment the following code to create the tables in the database.
        //CreateTableService.Calltable();
        
        ud =new Container().container(pm);
        DaoInsertTable.Insert(ud);
       
        
        if(pm.getPayload().getAccount() == null)
                     {
                     CreateTableService.CallInsertion(ud);
                     }
                    
              
                    
	}

	

}
