import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.model.IContestEntity;

import java.sql.Date;

/**
 * ProjectTeam: Team C
 * Date: 28.10.12
 */
public class Main {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(final String[] args) throws Exception {
        // Generate a session
        Integer sessionId = PersistenceFacade.generateSessionId();

        IContestEntity contest = PersistenceFacade.getContestDAO().generateObject(sessionId);
        contest.setEnd(new Date(new java.util.Date().getTime()));
        contest.setStart(new Date(new java.util.Date().getTime()));
        contest.setFee(15);
        contest.setName("TEST");
        // Starts a Transaction for this Session
        PersistenceFacade.startTransaction(sessionId);
        // Save the Member to Database
        PersistenceFacade.getContestDAO().saveOrUpdate(sessionId, contest);
        // Save the Member to Database
        // Commit the Transaction for this Session
        PersistenceFacade.commitTransaction(sessionId);

        // Close Session
        PersistenceFacade.closeSession(sessionId);
    }
}
