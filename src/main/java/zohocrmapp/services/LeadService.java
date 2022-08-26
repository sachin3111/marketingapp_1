package zohocrmapp.services;


import zohocrmapp.entities.Lead;

public interface LeadService {
	public void saveLead(Lead lead);

	public Lead getOneLeadById(long id);

	public void deleteOneLeadById(long id);


}
