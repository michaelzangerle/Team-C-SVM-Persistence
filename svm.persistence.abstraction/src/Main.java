import svm.persistence.PersistenceFacade;
import svm.persistence.hibernate.dao.ContactDetailsDAO;
import svm.persistence.hibernate.model.ContactDetailsEntity;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 18.10.12
 * Time: 16:39
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(final String[] args) throws Exception {
        Integer sessionId = PersistenceFacade.generateSessionId();

        ContactDetailsDAO dao = new ContactDetailsDAO();

        for (ContactDetailsEntity entity : dao.getAll(sessionId)) {
            System.out.println(entity.getLocationEntity().getPlaceName());
        }

        PersistenceFacade.closeSession(sessionId);
    }
}
