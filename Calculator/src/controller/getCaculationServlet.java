package controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Operators;
//import model.Operators;

/**
 * Servlet implementation class getCaculation
 */
@WebServlet("/getCaculation")
public class getCaculationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCaculationServlet() {
        super();
    }
        // TODO Auto-generated constructor stub
        /**
   	  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   	  */
   	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	  // TODO Auto-generated method stub
   	  doPost(request,response);
   	 }

   	 /**
   	  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   	  */
   	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	  // TODO Auto-generated method stub
   	  int number1, number2;
   	  String operator;
   	  response.setContentType("text/html");
   	  response.setCharacterEncoding("UTF-8");
   	  PrintWriter write = response.getWriter();
   	  number1 = Integer.parseInt(request.getParameter("userinput1"));
   	  number2 = Integer.parseInt(request.getParameter("userinput2"));
   	  operator = request.getParameter("operator"); 
   	 // object for the class.
   	 Operators calculate = new Operators(number1, number2, operator);
   	 calculate.calculation();   	     	   
   	if(operator.equals("/"))  
   	  write.write(number1 +" "+ operator +" "+ number2 + " = " + calculate.getResult2());
   	     else
   	    	write.write(number1 +" "+ operator +" "+ number2 + " = " + calculate.getResult1());
   	  write.write("</body></html>");
   	    	 
   	   
   	 
   	    

   	 }
   	}
