package cvdtc.dongle.dao;

import javax.ejb.Stateless;

import mobi.chouette.dao.ConnectionLinkDAO;
import mobi.chouette.model.ConnectionLink;

@Stateless
public class ConnectionLinkDAOImpl extends GenericDAOImpl<ConnectionLink> implements ConnectionLinkDAO {

	public ConnectionLinkDAOImpl() {
		super(ConnectionLink.class);
	}

}
