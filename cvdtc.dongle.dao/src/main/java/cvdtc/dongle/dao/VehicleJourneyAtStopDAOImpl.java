package cvdtc.dongle.dao;

import javax.ejb.Stateless;

import mobi.chouette.dao.VehicleJourneyAtStopDAO;
import mobi.chouette.model.VehicleJourneyAtStop;

@Stateless
public class VehicleJourneyAtStopDAOImpl extends
		GenericDAOImpl<VehicleJourneyAtStop> implements VehicleJourneyAtStopDAO{

	public VehicleJourneyAtStopDAOImpl() {
		super(VehicleJourneyAtStop.class);
	}

}
