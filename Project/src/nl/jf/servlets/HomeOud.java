package nl.jf.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nl.jf.yc.Data;
import nl.jf.yc.Kandidaat;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class HomeOud extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Data d = new Data();
	private String invoer = ""; 
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeOud() {
        super();
        // TODO Auto-generated constructor stub
    }       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getParameter("firstname") != null){
			invoer = request.getParameter("firstname");
   		}else{
   			invoer = "";
   		}
		
		request.setAttribute("LijstTotaal", d.getArrayTotaal());
		//request.setAttribute("Voornaam", d.getResultaat(invoer));
		request.setAttribute("getAge", d.getLeeftijd());
		request.setAttribute("getNaam", d.getNaam());
		//request.setAttribute("getSkills", d.getArrSkills());		
		
		request.getRequestDispatcher("WEB-INF/MainHtml.jsp").forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
