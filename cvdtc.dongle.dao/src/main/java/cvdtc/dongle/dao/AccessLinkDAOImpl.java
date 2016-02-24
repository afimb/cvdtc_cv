package cvdtc.dongle.dao;

import javax.ejb.Stateless;

import mobi.chouette.dao.AccessLinkDAO;
import mobi.chouette.model.AccessLink;

@Stateless
public class AccessLinkDAOImpl extends GenericDAOImpl<AccessLink> implements AccessLinkDAO {

	public AccessLinkDAOImpl() {
		super(AccessLink.class);
	}

}
