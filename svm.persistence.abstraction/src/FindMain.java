import svm.persistence.PersistenceFacade;
import svm.persistence.abstraction.dao.CompareObject;
import svm.persistence.abstraction.dao.FindQualifiers;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.IMemberEntity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * ProjectTeam: Team C
 * Date: 04.11.12
 */
public class FindMain {
    public static void main(String[] args) throws NoSessionFoundException {
        Integer sessionId = PersistenceFacade.generateSessionId();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        int d1 = 2;
        int m1 = Calendar.SEPTEMBER;
        int y1 = 1953;
        Date from = new GregorianCalendar(y1, m1, d1).getTime();

        int d2 = 4;
        int m2 = Calendar.SEPTEMBER;
        int y2 = 1953;
        Date to = new GregorianCalendar(y2, m2, d2).getTime();

        CompareObject compare = new CompareObject("birthDate", FindQualifiers.BETWEEN, "'" + format.format(from) + "' AND '" + format.format(to) + "'");

        for (IMemberEntity member : PersistenceFacade.getMemberDAO().find(sessionId, compare)) {
            System.out.println(member.getFirstName() + " " + member.getBirthDate().toString());
        }
        PersistenceFacade.closeSession(sessionId);
    }
}
