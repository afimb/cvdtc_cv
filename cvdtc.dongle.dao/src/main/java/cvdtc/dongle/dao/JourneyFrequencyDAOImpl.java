package cvdtc.dongle.dao;

import javax.ejb.Stateless;

import mobi.chouette.dao.JourneyFrequencyDAO;
import mobi.chouette.model.JourneyFrequency;

@Stateless
public class JourneyFrequencyDAOImpl extends GenericDAOImpl<JourneyFrequency> implements JourneyFrequencyDAO {

	public JourneyFrequencyDAOImpl() {
		super(JourneyFrequency.class);
	}

}
