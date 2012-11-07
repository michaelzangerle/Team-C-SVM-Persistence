package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.ISubTeamsHasMembersDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.ISubTeamsHasMembersEntity;
import svm.persistence.hibernate.model.SubTeamsHasMembersEntity;

/**
 * Projectteam: Team C
 * Date: 25.10.12
 */
public class SubTeamsHasMembersDAO extends AbstractDAO<ISubTeamsHasMembersEntity> implements ISubTeamsHasMembersDAO {

    public SubTeamsHasMembersDAO() {
        super(SubTeamsHasMembersEntity.class);
    }

    @Override
    public ISubTeamsHasMembersEntity generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException, NoSessionFoundException {
        return generateObject();
    }

    @Override
    public ISubTeamsHasMembersEntity generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException {
        return new SubTeamsHasMembersEntity();
    }
}
