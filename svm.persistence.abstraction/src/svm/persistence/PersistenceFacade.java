package svm.persistence;

import svm.persistence.abstraction.dao.*;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.persistence.abstraction.model.IEntity;
import svm.persistence.hibernate.HibernateUtil;

/**
 * ProjectTeam: Team C
 * Date: 19.10.12
 * Only Entry Point of Persistence Layer
 */
public class PersistenceFacade {

    //region Hibernate Session / Transaction

    /**
     * Generates a new Session for returned ID
     *
     * @return new Session ID
     */
    public static Integer generateSessionId() {
        return HibernateUtil.generateSessionId();
    }

    /**
     * Closes Session for given Id
     *
     * @param sessionId Session ID
     * @throws NoSessionFoundException No Session found for this ID
     */
    public static void closeSession(Integer sessionId) throws NoSessionFoundException {
        HibernateUtil.closeSession(sessionId);
    }

    /**
     * Reattach Object to a Session
     *
     * @param sessionId SessionID
     * @param entity    Entity
     */
    public static void reattachObjectToSession(Integer sessionId, IEntity entity) throws NoSessionFoundException {
        HibernateUtil.reattachObjectToSession(sessionId, entity);
    }

    /**
     * Returns true if Session exists for given Id
     *
     * @param sessionId Session Id
     * @return Session exists
     */
    public static boolean hasSession(Integer sessionId) {
        return HibernateUtil.hasSession(sessionId);
    }

    /**
     * Returns true if Session Transaction exists for given Id
     *
     * @param sessionId Session Id
     * @return Session exists
     * @throws NoSessionFoundException No Session found for this Id
     */
    public static boolean hasTransaction(Integer sessionId) throws NoSessionFoundException {
        return HibernateUtil.hasTransaction(sessionId);
    }

    /**
     * Start a Transaction for given Session ID
     *
     * @param sessionId Session ID
     * @throws NoSessionFoundException      No Session found for this ID
     * @throws ExistingTransactionException Existing Transaction found for this ID
     */
    public static void startTransaction(Integer sessionId) throws NoSessionFoundException, ExistingTransactionException {
        HibernateUtil.startTransaction(sessionId);
    }

    /**
     * Commit Session Transaction for given Id
     *
     * @param sessionId Session ID
     * @throws NoSessionFoundException No Session found for this Id
     * @throws NoTransactionException  No Transaction found for this Session
     */
    public static void commitTransaction(Integer sessionId) throws NoSessionFoundException, NoTransactionException {
        HibernateUtil.commitTransaction(sessionId);
    }

    /**
     * Abort Session Transaction for given Id
     *
     * @param sessionId Session ID
     * @throws NoSessionFoundException No Session found for this Id
     * @throws NoTransactionException  No Transaction found for this Session
     */
    public static void abortTransaction(Integer sessionId) throws NoSessionFoundException, NoTransactionException {
        HibernateUtil.abortTransaction(sessionId);
    }
    //endregion

    //region getDAOS

    /**
     * Returns a ContactDetails DAO
     *
     * @return IContactDetailsDAO
     */
    public static IContactDetailsDAO getContactDetailsDAO() {
        return DAOFactory.getInstance().getContactDetailsDAO();
    }

    /**
     * Returns a Contest DAO
     *
     * @return IContestDAO
     */
    public static IContestDAO getContestDAO() {
        return DAOFactory.getInstance().getContestDAO();
    }

    /**
     * Returns a Contest DAO
     *
     * @return IDepartmentDAO
     */
    public static IDepartmentDAO getDepartmentDAO() {
        return DAOFactory.getInstance().getDepartmentDAO();
    }

    /**
     * Returns a ExternalTeam DAO
     *
     * @return IExternalTeamDAO
     */
    public static IExternalTeamDAO getExternalTeamDAO() {
        return DAOFactory.getInstance().getExternalTeamDAO();
    }

    /**
     * Get Team Dao
     * @return  ITeamDAO
     */
    public  static ITeamDAO getTeamDAO()
    {
        return DAOFactory.getInstance().getTeamDAO();
    }

    /**
     * Returns a Location DAO
     *
     * @return ILocationDAO
     */
    public static ILocationDAO getLocationDAO() {
        return DAOFactory.getInstance().getLocationDAO();
    }

    /**
     * Returns a Match DAO
     *
     * @return IMatchDAO
     */
    public static IMatchDAO getMatchDAO() {
        return DAOFactory.getInstance().getMatchDAO();
    }

    /**
     * Returns a MatchType DAO
     *
     * @return IMatchTypeDAO
     */
    public static IMatchTypeDAO getMatchTypeDAO() {
        return DAOFactory.getInstance().getMatchTypeDAO();
    }

    /**
     * Returns a MemberFee DAO
     *
     * @return IMemberFeeDAO
     */
    public static IMemberFeeDAO getMemberFeeDAO() {
        return DAOFactory.getInstance().getMemberFeeDAO();
    }

    /**
     * Returns a Member DAO
     *
     * @return IMemberDAO
     */
    public static IMemberDAO getMemberDAO() {
        return DAOFactory.getInstance().getMemberDAO();
    }

    /**
     * Returns a MemberRole DAO
     *
     * @return IMemberRoleDAO
     */
    public static IMemberRoleDAO getMemberRoleDAO() {
        return DAOFactory.getInstance().getMemberRoleDAO();
    }

    /**
     * Returns a PartResult DAO
     *
     * @return IPartResultDAO
     */
    public static IPartResultDAO getPartResultDAO() {
        return DAOFactory.getInstance().getPartResultDAO();
    }

    /**
     * Returns a SubTeam DAO
     *
     * @return ISubTeamDAO
     */
    public static ISubTeamDAO getSubTeamDAO() {
        return DAOFactory.getInstance().getSubTeamDAO();
    }

    /**
     * Returns a TeamType DAO
     *
     * @return ITeamTypeDAO
     */
    public static ITeamTypeDAO getTeamTypeDAO() {
        return DAOFactory.getInstance().getTeamTypeDAO();
    }

    /**
     * Returns a UserPrivilege DAO
     *
     * @return IUserPrivilegeDAO
     */
    public static IUserPrivilegeDAO getUserPrivilegeDAO() {
        return DAOFactory.getInstance().getUserPrivilegeDAO();
    }

    /**
     * Returns a ContestHasTeams DAO
     *
     * @return IContestsHasTeamsDAO
     */
    public static IContestsHasTeamsDAO getContestHasTeamsDAO() {
        return DAOFactory.getInstance().getContestHasTeamsDAO();
    }

    /**
     * Returns a ContestHasExternalTeams DAO
     *
     * @return IContestsHasExternalTeamsDAO
     */
    public static IContestsHasExternalTeamsDAO getContestHasExternalTeamsDAO() {
        return DAOFactory.getInstance().getContestHasExternalTeamsDAO();
    }

    /**
     * Returns a SubTeamsHasMembers DAO
     *
     * @return ISubTeamsHasMembersDAO
     */
    public static ISubTeamsHasMembersDAO getSubTeamsHasMembersDAO() {
        return DAOFactory.getInstance().getSubTeamsHasMembersDAO();
    }
    //endregion
}