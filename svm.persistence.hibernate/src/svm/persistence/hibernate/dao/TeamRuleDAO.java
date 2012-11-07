package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.ITeamRuleDAO;
import svm.persistence.abstraction.model.ITeamRuleEntity;
import svm.persistence.hibernate.model.TeamRuleEntity;

/**
 * Projectteam: Team C
 * Date: 25.10.12
 */
public class TeamRuleDAO extends AbstractDAO<ITeamRuleEntity> implements ITeamRuleDAO {

    public TeamRuleDAO() {
        super(TeamRuleEntity.class);
    }

    @Override
    public ITeamRuleEntity generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException {
        return new TeamRuleEntity();
    }
}
