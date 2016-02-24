package cvdtc.dongle.dao;

import javax.ejb.Stateless;

import mobi.chouette.dao.RouteSectionDAO;
import mobi.chouette.model.RouteSection;

@Stateless
public class RouteSectionDAOImpl extends GenericDAOImpl<RouteSection> implements RouteSectionDAO{

	public RouteSectionDAOImpl() {
		super(RouteSection.class);
	}

}
