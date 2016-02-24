package cvdtc.dongle.dao;

import javax.ejb.Stateless;

import mobi.chouette.dao.CompanyDAO;
import mobi.chouette.model.Company;

@Stateless
public class CompanyDAOImpl extends GenericDAOImpl<Company> implements CompanyDAO{

	public CompanyDAOImpl() {
		super(Company.class);
	}

}
