package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.ISportDAO;
import svm.persistence.abstraction.model.ISportEntity;
import svm.persistence.hibernate.model.SportEntity;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public class SportDAO extends AbstractDAO<ISportEntity> implements ISportDAO {

    public SportDAO() {
        super(SportEntity.class);
    }

    @Override
    public ISportEntity generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException {
        return new SportEntity();
    }
}