package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.IExternalTeamDAO;
import svm.persistence.abstraction.model.IExternalTeamEntity;
import svm.persistence.hibernate.model.ExternalTeamEntity;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public class ExternalTeamDAO extends AbstractDAO<IExternalTeamEntity> implements IExternalTeamDAO {

    public ExternalTeamDAO() {
        super(ExternalTeamEntity.class);
    }
}
