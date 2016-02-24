package cvdtc.user.checker;

import javax.ejb.Stateless;

import mobi.chouette.common.ContenerChecker;


@Stateless(name = ContenerChecker.NAME)

public class UserChecker implements ContenerChecker
{


	@Override
	public boolean validateContener(String contenerName) {
		if (contenerName.equals("anonymous"))
		   return true;
		return (contenerName.matches("^[0-9]+$"));
		}
	
	@Override
	public String getContext() {
		return "cvdtc";
	}

}
