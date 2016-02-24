package cvdtc.dongle.dao;

import javax.ejb.Stateless;

import mobi.chouette.dao.LineDAO;
import mobi.chouette.model.Line;

@Stateless (name="LineDAO")
public class LineDAOImpl extends GenericDAOImpl<Line> implements LineDAO  {

	public LineDAOImpl() {
		super(Line.class);
	}

	
}
