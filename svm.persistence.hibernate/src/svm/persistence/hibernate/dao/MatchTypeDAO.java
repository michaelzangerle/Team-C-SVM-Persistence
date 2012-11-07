package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.IMatchTypeDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.IMatchTypeEntity;
import svm.persistence.hibernate.model.MatchTypeEntity;

import javax.transaction.NotSupportedException;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public class MatchTypeDAO extends AbstractDAO<IMatchTypeEntity> implements IMatchTypeDAO {

    public MatchTypeDAO() {
        super(MatchTypeEntity.class);
    }

    @Override
    public IMatchTypeEntity generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException, NotSupportedException, NoSessionFoundException {
        return generateObject();
    }

    @Override
    public IMatchTypeEntity generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException {
        IMatchTypeEntity entity = new MatchTypeEntity();
        return entity;
    }
}
