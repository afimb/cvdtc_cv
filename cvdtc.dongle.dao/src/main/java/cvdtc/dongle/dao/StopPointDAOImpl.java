package cvdtc.dongle.dao;

import javax.ejb.Stateless;

import mobi.chouette.dao.StopPointDAO;
import mobi.chouette.model.StopPoint;

@Stateless
public class StopPointDAOImpl extends GenericDAOImpl<StopPoint> implements StopPointDAO {

	public StopPointDAOImpl() {
		super(StopPoint.class);
	}

}
