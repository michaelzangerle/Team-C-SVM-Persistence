package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.ITeamsHasMemberDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NotSupportedException;
import svm.persistence.abstraction.model.ITeamsHasMembersEntity;
import svm.persistence.hibernate.model.TeamEntity;
import svm.persistence.hibernate.model.TeamsHasMembersEntity;

/**
 * Projectteam: Team C
 * Date: 25.10.12
 */
public class TeamsHasMembersDAO extends AbstractDAO<ITeamsHasMembersEntity> implements ITeamsHasMemberDAO {

    public TeamsHasMembersDAO() {
        super(TeamEntity.class);
    }

    @Override
    public ITeamsHasMembersEntity generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException, NotSupportedException, NoSessionFoundException {
        return generateObject();
    }

    @Override
    public ITeamsHasMembersEntity generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException {
        return new TeamsHasMembersEntity();
    }
}
