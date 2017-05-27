package com.dugu.jersy.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.dugu.jersy.pojo.Customer;
import com.dugu.jersy.util.CustomerUtils;

@Path("/customerInfo")
public class CustomerResource {

	// This method is called if HTML is request
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/{customerNo}")
	public Response getCustomerNameHtml(
			@PathParam("customerNo") String customerNo) {
		String result = "";
		Customer customer=new CustomerUtils().getCustomer(customerNo);
			result += "Name:-" + customer.getCustomerName() + "<br/>"
					+ "Email:-" + customer.getEmail() + "<br/>" + "Phone :-"
					+ customer.getPhone() + "<br/>" + "Salary:-"
					+ customer.getSalary() + "<br/>";
		
		return Response
				.status(200)
				.entity("<html> "
						+ "<title>"
						+ "Hello HTML Response"
						+ "</title><body bgcolor='lavender'><b color='navy'><h1 align='center'>"
						+ result + "</h1></b></body></html>").build();
	}
}