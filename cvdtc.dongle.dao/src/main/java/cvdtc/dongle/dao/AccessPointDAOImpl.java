package cvdtc.dongle.dao;

import javax.ejb.Stateless;

import mobi.chouette.dao.AccessPointDAO;
import mobi.chouette.model.AccessPoint;

@Stateless
public class AccessPointDAOImpl extends GenericDAOImpl<AccessPoint> implements AccessPointDAO {

	public AccessPointDAOImpl() {
		super(AccessPoint.class);
	}

}
