package nl.jf.servlets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import nl.jf.yc.Kandidaat;
import nl.jf.yc.KandidaatDao;

@SessionAttributes("Kandidaat")
@Controller

public class KandidaatController {
	private String invoer = ""; 
	
	@ModelAttribute("Kandidaat")
	public Kandidaat createKandidaat() {
		return new Kandidaat();
	}
	
	@RequestMapping("/home")
	public String homeMvc(Model model) {	
		// DISPLAY GEGEVENS KANDIDAAT
		model.addAttribute("kandidaten", KandidaatDao.all());
		return "MainHtml";
	}
	
	/*@RequestMapping(value="/home", method=RequestMethod.POST)
	public String homeMvc(Model model,
						  @RequestParam String naam,  
						  @RequestParam int leeftijd){
		//MAAK KANDIDAAT
		return "MainHtml";
	}*/

	//MAAK KANDIDAAT
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String create(String naam, int leeftijd){
		KandidaatDao.create(naam, leeftijd);
		return "redirect:/home";
	}
}
