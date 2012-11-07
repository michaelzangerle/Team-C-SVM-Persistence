package svm.persistence.hibernate.dao;

import svm.persistence.DAOFactory;
import svm.persistence.abstraction.dao.IContestDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NotSupportedException;
import svm.persistence.abstraction.model.IContestEntity;
import svm.persistence.hibernate.model.ContestEntity;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public class ContestDAO extends AbstractDAO<IContestEntity> implements IContestDAO {

    public ContestDAO() {
        super(ContestEntity.class);
    }

    @Override
    public IContestEntity generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException {
        IContestEntity entity = new ContestEntity();
        entity.setContactDetails(DAOFactory.getInstance().getContactDetailsDAO().generateObject(sessionId));
        return entity;
    }

    @Override
    public IContestEntity generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException {
        throw new NotSupportedException();
    }
}
