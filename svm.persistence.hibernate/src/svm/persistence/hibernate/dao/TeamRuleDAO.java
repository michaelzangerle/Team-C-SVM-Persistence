package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.ITeamRuleDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NotSupportedException;
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
    public ITeamRuleEntity generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException, NotSupportedException, NoSessionFoundException {
        return generateObject();
    }

    @Override
    public ITeamRuleEntity generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException {
        return new TeamRuleEntity();
    }
}
