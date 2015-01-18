package com.layout.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateFileLayout
 */
public class CreateFileLayout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateFileLayout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] field_name = request.getParameterValues("field_name");
		String[] field_value = request.getParameterValues("field_value");
		String[] field_length = request.getParameterValues("field_length");
		String[] field_justified_checked = request.getParameterValues("field_justified_checked");
		
		//System.out.println("field_justified length:        "+field_justified.length);
		
		String content = "";
		PrintWriter pw = response.getWriter();
				
		for(int itr =0; itr < field_name.length; itr +=1)
		{
			try{
				System.out.println("field_name: "+field_name[itr]+ ", field_value: "+field_value[itr]);
				String fieldValue="";
				String fieldStringValue="";
				int fieldIntValue=0;
				
				if(field_value[itr] !="" && field_value[itr].length() > Integer.parseInt(field_length[itr]))
				{
					fieldValue = field_value[itr].substring(0,Integer.parseInt(field_length[itr]));
				}
				else
				{
					fieldValue = field_value[itr];
				}		
			
			
								
					if(field_justified_checked[itr].equals("on"))
					{
						if(fieldValue != ""){
							fieldIntValue = Integer.parseInt(fieldValue);
						}
						else{
							fieldIntValue = 0;
						}
						System.out.println("inside field_justified....."+field_justified_checked[itr]);
						content = content + String.format("%0"+Integer.parseInt(field_length[itr])+"d", fieldIntValue);
					}else{
						fieldStringValue = 	fieldValue;		
						System.out.println("outside field_justified.....");
						content = content + String.format("%-"+Integer.parseInt(field_length[itr])+"s", fieldStringValue);			
					}					
			}
			catch(Exception ex)
			{
				System.out.println("Error: "+ ex.getMessage());
			}
		}
		
		try
		{
			File file = new File("D:/xyz.txt");
			FileWriter fstream = new FileWriter(file,true);
			BufferedWriter out = new BufferedWriter(fstream);	
			out.write(content);
			out.newLine();
			out.close();
			pw.println("File is created successfully");
		}
		catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}		
	}

}
