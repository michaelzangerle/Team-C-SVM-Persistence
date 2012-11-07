package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.IMatchTypeDAO;
import svm.persistence.abstraction.model.IMatchTypeEntity;
import svm.persistence.hibernate.model.MatchTypeEntity;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public class MatchTypeDAO extends AbstractDAO<IMatchTypeEntity> implements IMatchTypeDAO {

    public MatchTypeDAO() {
        super(MatchTypeEntity.class);
    }

    @Override
    public IMatchTypeEntity generateObject() throws InstantiationException, IllegalAccessException {
        IMatchTypeEntity entity = new MatchTypeEntity();
        return entity;
    }
}
