package svm.persistence.test;

import junit.framework.TestCase;
import svm.persistence.hibernate.HibernateUtil;

import java.util.LinkedList;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 20.10.12
 */
public class HibernateUtilTest extends TestCase {
    public void setUp() throws Exception {

    }

    public void tearDown() throws Exception {

    }

    public void testGetSession() throws Exception {

    }

    public void testCloseSession() throws Exception {

    }

    public void testGenerateSessionId() throws Exception {
        List<Integer> ids = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            Integer sessionId = HibernateUtil.generateSessionId();
            assertFalse("SessionId is existing", ids.contains(sessionId));
            ids.add(sessionId);
            assertTrue("Session not Found", HibernateUtil.hasSession(sessionId));
        }
    }

    public void testStartTransaction() throws Exception {

    }

    public void testCommitTransaction() throws Exception {

    }

    public void testAbortTransaction() throws Exception {

    }

    public void testHasSession() throws Exception {

    }

    public void testHasTransaction() throws Exception {

    }
}
