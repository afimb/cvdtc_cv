package cvdtc.dongle.dao;

import javax.ejb.Stateless;

import mobi.chouette.dao.GroupOfLineDAO;
import mobi.chouette.model.GroupOfLine;

@Stateless
public class GroupOfLineDAOImpl extends GenericDAOImpl<GroupOfLine> implements GroupOfLineDAO {

	public GroupOfLineDAOImpl() {
		super(GroupOfLine.class);
	}


}
