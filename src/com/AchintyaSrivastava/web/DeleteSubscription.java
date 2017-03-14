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
import com.AchintyaSrivastava.services.DeleteTableService;
import com.AchintyaSrivastava.util.Container;
import com.AchintyaSrivastava.util.OAuth;

/**
 * Servlet implementation class DeleteSubscription
 */
@WebServlet("/DeleteSubscription")
public class DeleteSubscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        ObjectMapper mapper = new ObjectMapper();
        String eventUrl= (String) request.getParameter("eventUrl");
        String myurl= request.getParameter("eventUrl");
        
        Parent_main pm=new OAuth().Sign(myurl);
        
        UserDetails ud=new UserDetails();
    //DragonBallProduct m= new DragonBallProduct(true,"Achintya");
        //m.setSuccess(true);
        //m.setAccountIdentifier("Achintya");
      //  ResponseSuccess responseObject= new ResponseSucess(true,"new-account-modifier");
           
        ud =new Container().container(pm);
        
        DeleteTableService.deleteTableService(ud);
                    
        DragonBallProduct db= new DragonBallProduct();
        db.setSuccess(true);
        
        
        String json = mapper.writeValueAsString(db);
        out.print(json);
        System.out.println(eventUrl);
               
	}


	

}
