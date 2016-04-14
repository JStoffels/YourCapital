package nl.jf.servlets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import nl.jf.yc.Kandidaat;
import nl.jf.yc.KandidaatDao;

@SessionAttributes("Kandidaat")
@Controller
public class KandidaatController {
		
	@ModelAttribute("Kandidaat")
	public Kandidaat createKandidaat() {
		return new Kandidaat();
	}
	
	@RequestMapping("/home")
	public String homeMvc(Model model) {
		model.addAttribute("kandidaten", KandidaatDao.all());
		return "MainHtml";
	}
	

	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String create(Model model, String naam, int leeftijd){
		KandidaatDao.create(naam, leeftijd);
		return "redirect:/home";
	}
	
	@RequestMapping(value="/delete/{id}")
	public String deleteView(@PathVariable String id){
		Long key;
		try{
			key = Long.valueOf(id);
		}
		catch(NumberFormatException e){
			// id is geen getal? error 404
			return null;
		}
		KandidaatDao.remove(key);
		return "redirect:/home";
	}
	
	@RequestMapping(value="/kandidaat/{id}")
	public String detailView(@PathVariable String id, Model model){
		Long key;
		try{
			key = Long.valueOf(id);
		}
		catch(NumberFormatException e){
			// id is geen getal? error 404
			return null;
		}
		Kandidaat k = KandidaatDao.find(key);
		if(k == null){
			// geen rit met gegeven id? error 404
			return null;
		} else {
			model.addAttribute("kandidaat", k);
			return "kandidaatdetail";
		}
	}
	
}
