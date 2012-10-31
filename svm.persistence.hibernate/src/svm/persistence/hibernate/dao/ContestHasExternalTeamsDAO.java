package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.IContestsHasExternalTeamsDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.IContestsHasExternalTeamsEntity;
import svm.persistence.hibernate.model.ContestsHasExternalTeamsEntity;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public class ContestHasExternalTeamsDAO extends AbstractDAO<IContestsHasExternalTeamsEntity> implements IContestsHasExternalTeamsDAO {

    public ContestHasExternalTeamsDAO() {
        super(ContestsHasExternalTeamsEntity.class);
    }

    @Override
    public IContestsHasExternalTeamsEntity generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException {
        return new ContestsHasExternalTeamsEntity();
    }
}
