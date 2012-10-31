package svm.persistence;

import svm.persistence.abstraction.dao.*;
import svm.persistence.hibernate.dao.*;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ProjectTeam: Team C
 * Date: 19.10.12
 * Factory for Data Access Objects
 */
public class DAOFactory {
    private static DAOFactory instance;

    public static DAOFactory getInstance() {
        if (instance == null) {
            instance = new DAOFactory();
        }
        return instance;
    }

    private HashMap<Class, IDAO> daos = new HashMap<Class, IDAO>();

    /**
     * Generates a SingleTon DAO Object for given Class
     *
     * @param aClass DAO Object Class
     * @return DAO Object
     */
    private IDAO getDAO(Class aClass) {
        try {
            if (!daos.containsKey(aClass)) {
                daos.put(aClass, (IDAO) aClass.newInstance());
            }
            return daos.get(aClass);
        } catch (ReflectiveOperationException ex) {
            Logger.getLogger("Persistence").log(Level.WARNING, "Class PersonDAO not found: " + ex.getMessage());
            return null;
        } catch (ClassCastException ex) {
            Logger.getLogger("Persistence").log(Level.WARNING, "Cannot cast Class: " + ex.getMessage());
            return null;
        }
    }

    /**
     * Returns a ContactDetails DAO
     *
     * @return IContactDetailsDAO
     */
    public IContactDetailsDAO getContactDetailsDAO() {
        return (IContactDetailsDAO) getDAO(ContactDetailsDAO.class);
    }

    /**
     * Returns a Contest DAO
     *
     * @return IContestDAO
     */
    public IContestDAO getContestDAO() {
        return (IContestDAO) getDAO(ContestDAO.class);
    }

    /**
     * Returns a Contest DAO
     *
     * @return IDepartmentDAO
     */
    public IDepartmentDAO getDepartmentDAO() {
        return (IDepartmentDAO) getDAO(DepartmentDAO.class);
    }

    /**
     * Returns a ExternalTeam DAO
     *
     * @return IExternalTeamDAO
     */
    public IExternalTeamDAO getExternalTeamDAO() {
        return (IExternalTeamDAO) getDAO(ExternalTeamDAO.class);
    }

    /**
     * Returns a Location DAO
     *
     * @return ILocationDAO
     */
    public ILocationDAO getLocationDAO() {
        return (ILocationDAO) getDAO(LocationDAO.class);
    }

    /**
     * Returns a Match DAO
     *
     * @return IMatchDAO
     */
    public IMatchDAO getMatchDAO() {
        return (IMatchDAO) getDAO(MatchDAO.class);
    }

    /**
     * Returns a MatchType DAO
     *
     * @return IMatchTypeDAO
     */
    public IMatchTypeDAO getMatchTypeDAO() {
        return (IMatchTypeDAO) getDAO(MatchTypeDAO.class);
    }

    /**
     * Returns a MemberFee DAO
     *
     * @return IMemberFeeDAO
     */
    public IMemberFeeDAO getMemberFeeDAO() {
        return (IMemberFeeDAO) getDAO(MemberFeeDAO.class);
    }

    /**
     * Returns a Member DAO
     *
     * @return IMemberDAO
     */
    public IMemberDAO getMemberDAO() {
        return (IMemberDAO) getDAO(MemberDAO.class);
    }

    /**
     * Returns a MemberRole DAO
     *
     * @return IMemberRoleDAO
     */
    public IMemberRoleDAO getMemberRoleDAO() {
        return (IMemberRoleDAO) getDAO(MemberRoleDAO.class);
    }

    /**
     * Returns a PartResult DAO
     *
     * @return IPartResultDAO
     */
    public IPartResultDAO getPartResultDAO() {
        return (IPartResultDAO) getDAO(PartResultDAO.class);
    }

    /**
     * Returns a SubTeam DAO
     *
     * @return ISubTeamDAO
     */
    public ISubTeamDAO getSubTeamDAO() {
        return (ISubTeamDAO) getDAO(SubTeamDAO.class);
    }

    /**
     * Returns a TeamType DAO
     *
     * @return ITeamTypeDAO
     */
    public ITeamTypeDAO getTeamTypeDAO() {
        return (ITeamTypeDAO) getDAO(TeamTypeDAO.class);
    }

    /**
     * Returns a UserPrivilege DAO
     *
     * @return IUserPrivilegeDAO
     */
    public IUserPrivilegeDAO getUserPrivilegeDAO() {
        return (IUserPrivilegeDAO) getDAO(UserPrivilegeDAO.class);
    }

    /**
     * Returns a ContestHasTeams DAO
     *
     * @return IContestsHasTeamsDAO
     */
    public IContestsHasTeamsDAO getContestHasTeamsDAO() {
        return (IContestsHasTeamsDAO) getDAO(ContestHasTeamsDAO.class);
    }

    /**
     * Returns a ContestHasExternalTeams DAO
     *
     * @return IContestsHasExternalTeamsDAO
     */
    public IContestsHasExternalTeamsDAO getContestHasExternalTeamsDAO() {
        return (IContestsHasExternalTeamsDAO) getDAO(ContestHasExternalTeamsDAO.class);
    }
}
