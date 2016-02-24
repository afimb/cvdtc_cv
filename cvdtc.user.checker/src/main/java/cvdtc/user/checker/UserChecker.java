package cvdtc.user.checker;

import javax.ejb.Stateless;

import mobi.chouette.service.ContenerCheckerInterface;


@Stateless(name = ContenerCheckerInterface.NAME)

public class UserChecker implements ContenerCheckerInterface
{


	@Override
	public boolean validateContener(String contenerName) {
		if (contenerName.equals("anonymous"))
		   return true;
		return (contenerName.matches("^[0-9]+$"));
		}
	

}
