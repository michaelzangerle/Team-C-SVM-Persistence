package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.IContestantDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.IContestantEntity;
import svm.persistence.hibernate.model.ContestantEntity;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public class ContestantDAO extends AbstractDAO<IContestantEntity> implements IContestantDAO {

    public ContestantDAO() {
        super(ContestantEntity.class);
    }

    @Override
    public IContestantEntity generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException {
        IContestantEntity entity = new ContestantEntity();
        return entity;
    }
}
