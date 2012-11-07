package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.ITeamTypeDAO;
import svm.persistence.abstraction.model.ITeamTypeEntity;
import svm.persistence.hibernate.model.TeamTypeEntity;

/**
 * Projectteam: Team C
 * Date: 25.10.12
 */
public class TeamTypeDAO extends AbstractDAO<ITeamTypeEntity> implements ITeamTypeDAO {

    public TeamTypeDAO() {
        super(TeamTypeEntity.class);
    }

    @Override
    public ITeamTypeEntity generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException {
        return new TeamTypeEntity();
    }
}
