/*package nl.jf.servlets;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import nl.jf.yc.Data;
import nl.jf.yc.Kandidaat;

@SessionAttributes("Kandidaat")
@Controller

public class HomeController {
	Data d = new Data();
	private String invoer = ""; 
	
	@ModelAttribute("Kandidaat")
	public Kandidaat createKandidaat() {
		return new Kandidaat();
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String homeMvc(Model model) {	
		
		model.addAttribute("LijstTotaal", d.getArrayTotaal());
		model.addAttribute("getAge", d.getLeeftijd());
		model.addAttribute("getNaam", d.getNaam());
		
		//request.setAttribute("getSkills", d.getArrSkills());	
		//request.setAttribute("Voornaam", d.getResultaat(invoer));
		
		return "MainHtml";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String homeMvc(Model model,
						  @RequestParam String naam,  
						  @RequestParam int leeftijd){
		//				  @RequestParam ArrayList<String> arrSkills) {
		model.addAttribute("LijstTotaal", d.getArrayTotaal());
		model.addAttribute("getAge", d.getLeeftijd());
		model.addAttribute("getNaam", d.getNaam());
		model.addAttribute("naam", naam);
		model.addAttribute("leeftijd", leeftijd);
		//model.addAttribute("arrSkills", arrSkills);
	
		return "MainHtml";
	}
}
*/