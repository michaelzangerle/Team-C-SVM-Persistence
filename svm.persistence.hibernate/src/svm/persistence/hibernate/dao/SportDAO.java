package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.ISportDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.ISportEntity;
import svm.persistence.hibernate.model.SportEntity;

import javax.transaction.NotSupportedException;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public class SportDAO extends AbstractDAO<ISportEntity> implements ISportDAO {

    public SportDAO() {
        super(SportEntity.class);
    }

    @Override
    public ISportEntity generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException, NotSupportedException, NoSessionFoundException {
        return generateObject();
    }

    @Override
    public ISportEntity generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException {
        return new SportEntity();
    }
}