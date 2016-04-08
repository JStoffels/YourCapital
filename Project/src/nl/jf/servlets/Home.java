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
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Data d = new Data();
	private String invoer = ""; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private String myHtml(){
    	d.addData();
    	return ""
    			+ ""
    			+ "<html>"
    			+ "<body>"
    			+ "<p>Test kandidaat!</p>"
    			+ "<p>"+getArrayNaam()+"</p>"
    	    	+ "<form method=get>"
    	    	+ "First Name: <br>"
    	    	+ "<input type=text name=firstname><br>"
    	    	+ "<br><input type=submit value=Search>"    
    	    	+ "</form>"
    	    	+ getVoornaam(invoer)
    			+ "</body>"
    			+ "</html>";
    }

    private String getArrayNaam(){

    	String sb = "";
    	for (int i =0; i < d.arrKandidaat.size(); i++){
    		sb = sb.concat(d.arrKandidaat.get(i).getNaam() +"   " + d.arrKandidaat.get(i).getLeeftijd() +"<br>");    		
    	}
    	return sb;
    }
    
   private String getVoornaam(String s){
	   if(d.arrKandidaat == null){
  			d.addData();
   		}
	   if(s==""){
    		return getArrayNaam();
    	}else if(s!=""){
    		for(Kandidaat k: d.arrKandidaat){
    			if(s.equals(k.getNaam().toString())){
    				return k.getNaam();
    			}
    		}
    	}
    	return "Invalid entry";
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
		response.getWriter().append(myHtml());
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
