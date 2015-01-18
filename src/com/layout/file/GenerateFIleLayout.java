package com.layout.file;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class GenerateFIleLayout
 */
public class GenerateFIleLayout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GenerateFIleLayout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Generating Coloumns..DoGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Generating Coloumns..");
		String noOfFields =    request.getParameter("no_of_fields");
		String interfaceName = request.getParameter("interface_name");
		PrintWriter out = response.getWriter();
		out.write("noOfFields  : " +noOfFields);
		out.write("interfaceName  : " +interfaceName);
		
		
		
		if(noOfFields !="")
		{
			request.setAttribute("noOfFields", Integer.parseInt(noOfFields));
			request.setAttribute("interfaceName", interfaceName);
			request.getRequestDispatcher("./welcome.jsp").forward(request, response);
		}
		else{
			System.out.println("Error..");
			response.sendRedirect("./");
		}
	}

}
