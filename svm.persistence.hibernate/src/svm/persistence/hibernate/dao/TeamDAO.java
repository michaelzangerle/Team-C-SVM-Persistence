package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.ITeamDAO;
import svm.persistence.abstraction.model.ITeamEntity;
import svm.persistence.hibernate.model.TeamEntity;

/**
 * Projectteam: Team C
 * Date: 25.10.12
 */
public class TeamDAO extends AbstractDAO<ITeamEntity> implements ITeamDAO {

    public TeamDAO() {
        super(TeamEntity.class);
    }

    @Override
    public ITeamEntity generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException {
        return new TeamEntity();
    }
}
