import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.dao.IMemberDAO;
import svm.persistence.abstraction.model.IMemberEntity;

import java.util.List;

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
        PersistenceFacade.getContestDAO().generateObject();


        // Generate a session
        Integer sessionId = PersistenceFacade.generateSessionId();

        // Get DAO for Members
        IMemberDAO dao = PersistenceFacade.getMemberDAO();
        // Get a list of all Members
        List<IMemberEntity> members = dao.getAll(sessionId);
        // Iterate over all Members
        for (IMemberEntity entity : members) {
            // Get FirstName of Member
            String firstName = entity.getFirstName();
            // Get LastName of Member
            String lastName = entity.getLastName();

            System.out.println(firstName + " " + lastName);
        }

        // Generate a new Member Object
        IMemberEntity newMember = dao.generateObject();
        newMember.setFirstName("Thomas");
        newMember.setLastName("Feilhauer");

        // Starts a Transaction for this Session
        PersistenceFacade.startTransaction(sessionId);
        // Save the Member to Database
        dao.saveOrUpdate(sessionId, newMember);
        // Commit the Transaction for this Session
        PersistenceFacade.commitTransaction(sessionId);

        // Close Session
        PersistenceFacade.closeSession(sessionId);
    }
}
