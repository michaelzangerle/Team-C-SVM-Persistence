package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.IMatchDAO;
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
}
