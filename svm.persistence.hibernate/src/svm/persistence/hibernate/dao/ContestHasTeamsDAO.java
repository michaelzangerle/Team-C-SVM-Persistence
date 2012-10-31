package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.IContestsHasTeamsDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.IContestsHasTeamsEntity;
import svm.persistence.hibernate.model.ContestsHasTeamsEntity;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public class ContestHasTeamsDAO extends AbstractDAO<IContestsHasTeamsEntity> implements IContestsHasTeamsDAO {

    public ContestHasTeamsDAO() {
        super(ContestsHasTeamsEntity.class);
    }

    @Override
    public IContestsHasTeamsEntity generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException {
        return new ContestsHasTeamsEntity();
    }
}
