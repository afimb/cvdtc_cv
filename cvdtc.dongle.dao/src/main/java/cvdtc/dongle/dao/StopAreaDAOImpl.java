package cvdtc.dongle.dao;

import javax.ejb.Stateless;

import mobi.chouette.dao.StopAreaDAO;
import mobi.chouette.model.StopArea;

@Stateless
public class StopAreaDAOImpl extends GenericDAOImpl<StopArea> implements StopAreaDAO {
	public StopAreaDAOImpl() {
		super(StopArea.class);
	}
}
