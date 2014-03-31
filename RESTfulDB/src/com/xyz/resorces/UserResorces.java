package com.xyz.resorces;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.xyz.dao.UserDao;


@Path ("/details")
public class UserResorces {
	
	UserDao dao = new UserDao();
	
	
	@GET
	@Path ("/get")
	public String usernameGet () {
				
		return "Hi From @GET methos !!";
	}
		
	
	@POST
	@Path ("/post/{firstName},{lastName}")
	@Consumes ()
	public String usernamePost (@PathParam ("firstName") String firstName, @PathParam ("lastName") String lastName ) {
		
		
		
		//return "First Name is :" + firstName + " " + "Last Name is : " + lastName ; 
		
		dao.createUser(firstName, lastName);
		return firstName;
		
	}
	
	

}
