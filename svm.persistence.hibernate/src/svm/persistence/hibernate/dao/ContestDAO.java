package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.IContestDAO;
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
}
