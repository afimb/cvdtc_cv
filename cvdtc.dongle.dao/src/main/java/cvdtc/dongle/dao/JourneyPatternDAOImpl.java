package cvdtc.dongle.dao;

import javax.ejb.Stateless;

import mobi.chouette.dao.JourneyPatternDAO;
import mobi.chouette.model.JourneyPattern;

@Stateless
public class JourneyPatternDAOImpl extends GenericDAOImpl<JourneyPattern> implements JourneyPatternDAO {

	public JourneyPatternDAOImpl() {
		super(JourneyPattern.class);
	}


}
