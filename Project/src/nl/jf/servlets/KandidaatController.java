package nl.jf.servlets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import nl.jf.yc.Kandidaat;
import nl.jf.yc.KandidaatDao;
import nl.jf.yc.Skill;
import nl.jf.yc.SkillDao;

@SessionAttributes("Kandidaat")
@Controller
public class KandidaatController {
		
	@ModelAttribute("kandidaat")
	public Kandidaat createKandidaat() {
		return new Kandidaat();
	}
	
	@RequestMapping("/home")
	public String homeMvc(Model model) {
		model.addAttribute("kandidaten", KandidaatDao.all());
		return "MainHtml";
	}
	
	@RequestMapping("/carousel")
	public String carousel(){
		return "index";
	}
	
	@RequestMapping(value="/zoek", method=RequestMethod.GET)
	public String zoekhtml(Model model, String naam){
		model.addAttribute("kandidaten", KandidaatDao.all());
		model.addAttribute("namen", naam);
		return "ZoekHtml";
	}
	
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public @ResponseBody String test(){
		
		SkillDao.addSkill(2L,2L);		
		return "Ok";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String create(Model model, String naam, int leeftijd){
		KandidaatDao.create(naam, leeftijd);
		return "redirect:/home";
	}
	
	@RequestMapping(value="/zoek", method=RequestMethod.POST)
	public String search(Model model, String naam){
		model.addAttribute("namen", naam);
		return "ZoekHtml";
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
	
	@RequestMapping(value="/deleteskill/{sid}/{kid}")
	public String deleteSkill(@PathVariable String sid, @PathVariable String kid){
		Long key;
		try{
			key = Long.valueOf(sid);
		}
		catch(NumberFormatException e){
			// id is geen getal? error 404
			return null;
		}
		SkillDao.remove(key);
		return "redirect:/kandidaat/{kid}";
	}
	
	@RequestMapping(value="/kandidaat/{id}")
	public String detailView(@PathVariable String id, Model model){
		Long key;
		model.addAttribute("skills", SkillDao.all());
		try{
			key = Long.valueOf(id);
		}
		catch(NumberFormatException e){
			// id is geen getal? error 404
			return null;
		}
		Kandidaat k = KandidaatDao.find(key);
		if(k == null){
			// geen kandidaat met gegeven id? error 404
			return null;
		} else {
			model.addAttribute("kandidaat", k);
			return "kandidaatdetail";
		}
	}
	
	@RequestMapping(value="/kandidaat/{id}", method=RequestMethod.POST)
	public String createSkill(@PathVariable Long id, Model model, String naam){
		Skill s = SkillDao.create(naam, id);
		Long x = s.getId();
		//SkillDao.addSkill(x, id, naam);
			return "redirect:/kandidaat/{id}";	
	
	}
}
