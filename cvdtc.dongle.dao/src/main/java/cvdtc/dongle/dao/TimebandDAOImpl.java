package cvdtc.dongle.dao;

import javax.ejb.Stateless;

import mobi.chouette.dao.TimebandDAO;
import mobi.chouette.model.Timeband;

@Stateless
public class TimebandDAOImpl extends GenericDAOImpl<Timeband> implements TimebandDAO {

	public TimebandDAOImpl() {
		super(Timeband.class);
	}
}
