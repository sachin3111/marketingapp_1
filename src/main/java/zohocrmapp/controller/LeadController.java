package zohocrmapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import zohocrmapp.entities.Contact;
import zohocrmapp.entities.Lead;
import zohocrmapp.services.ContactService;
import zohocrmapp.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/")
	public String viewLead() {
		return "create_lead";
	}
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id) {
	Lead lead = leadService.getOneLeadById(id);
	
	Contact contact = new Contact();
	
	contact.setFirstName(lead.getFirstName());
	contact.setLastName(lead.getLastName());
	contact.setEmail(lead.getEmail());
	contact.setMobile(lead.getMobile());
	
	contactService.saveContact(contact);
	 leadService.deleteOneLeadById(id);
	
		return "";
	}

}
