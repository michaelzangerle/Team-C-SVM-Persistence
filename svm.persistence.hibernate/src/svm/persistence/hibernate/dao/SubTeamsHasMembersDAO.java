package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.ISubTeamsHasMembersDAO;
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
    public ISubTeamsHasMembersEntity generateObject() throws InstantiationException, IllegalAccessException {
        return new SubTeamsHasMembersEntity();
    }
}
