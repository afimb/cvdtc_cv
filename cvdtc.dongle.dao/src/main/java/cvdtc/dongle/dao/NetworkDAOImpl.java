package cvdtc.dongle.dao;

import javax.ejb.Stateless;

import mobi.chouette.dao.NetworkDAO;
import mobi.chouette.model.Network;

@Stateless
public class NetworkDAOImpl extends GenericDAOImpl<Network> implements NetworkDAO {

	public NetworkDAOImpl() {
		super(Network.class);
	}

}
