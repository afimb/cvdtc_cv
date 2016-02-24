package cvdtc.dongle.dao;

import javax.ejb.Stateless;

import mobi.chouette.dao.TimetableDAO;
import mobi.chouette.model.Timetable;

@Stateless
public class TimetableDAOImpl extends GenericDAOImpl<Timetable> implements TimetableDAO {

	public TimetableDAOImpl() {
		super(Timetable.class);
	}

}
