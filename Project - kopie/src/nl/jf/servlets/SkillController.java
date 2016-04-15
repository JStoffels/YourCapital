/*package nl.jf.servlets;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import nl.jf.yc.Skill;
import nl.jf.yc.SkillDao;

@SessionAttributes("skill")
@Controller
public class SkillController {

	@ModelAttribute("skill")
	public Skill createSkill() {
		return new Skill();
	}

	@RequestMapping("/skill/{id}")
	public String kandidaatView(@PathVariable int id, Model model){
		//model.addAttribute("skills", SkillDao.all());
		return "kandidaatdetail";
	}
	
	@RequestMapping(value="/skill/{id}", method=RequestMethod.POST)
	public String skillView(@Valid Skill skill, BindingResult result, String naam){
		SkillDao.create(naam);
		return"redirect:/kandidaat/{id}";
	}
}
*/