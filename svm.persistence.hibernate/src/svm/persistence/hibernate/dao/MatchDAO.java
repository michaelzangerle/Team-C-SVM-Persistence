package svm.persistence.hibernate.dao;

import svm.persistence.DAOFactory;
import svm.persistence.abstraction.dao.IMatchDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NotSupportedException;
import svm.persistence.abstraction.model.IMatchEntity;
import svm.persistence.hibernate.model.MatchEntity;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public class MatchDAO extends AbstractDAO<IMatchEntity> implements IMatchDAO {

    public MatchDAO() {
        super(MatchEntity.class);
    }

    @Override
    public IMatchEntity generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException {
        IMatchEntity entity = new MatchEntity();
        entity.setContactDetails(DAOFactory.getInstance().getContactDetailsDAO().generateObject(sessionId));
        return entity;
    }

    @Override
    public IMatchEntity generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException {
        throw new NotSupportedException();
    }
}
