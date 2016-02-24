package cvdtc.dongle.dao;

import javax.ejb.Stateless;

import mobi.chouette.dao.VehicleJourneyDAO;
import mobi.chouette.model.VehicleJourney;

@Stateless

public class VehicleJourneyDAOImpl extends GenericDAOImpl<VehicleJourney> implements VehicleJourneyDAO{

	public VehicleJourneyDAOImpl() {
		super(VehicleJourney.class);
	}

}
