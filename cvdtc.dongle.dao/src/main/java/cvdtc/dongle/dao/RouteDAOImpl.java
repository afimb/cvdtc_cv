package cvdtc.dongle.dao;

import javax.ejb.Stateless;

import mobi.chouette.dao.RouteDAO;
import mobi.chouette.model.Route;

@Stateless
public class RouteDAOImpl extends GenericDAOImpl<Route> implements RouteDAO {

	public RouteDAOImpl() {
		super(Route.class);
	}

}
