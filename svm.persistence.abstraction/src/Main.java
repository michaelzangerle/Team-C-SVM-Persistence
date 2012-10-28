import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.model.IContactDetailsEntity;

import java.util.Date;

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
        Integer sessionId = PersistenceFacade.generateSessionId();

        Long t1 = new Date().getTime();
        for (IContactDetailsEntity entity : PersistenceFacade.getContactDetailsDAO().getAll(sessionId)) {
            System.out.println(entity.getLocationEntity().getPlaceName());
        }
        Long t2 = new Date().getTime();

        PersistenceFacade.closeSession(sessionId);

        System.out.println(t2 - t1);
    }
}
