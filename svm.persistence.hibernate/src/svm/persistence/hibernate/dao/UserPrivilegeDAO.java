package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.IUserPrivilegeDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NotSupportedException;
import svm.persistence.abstraction.model.IUserPrivilegeEntity;
import svm.persistence.hibernate.model.UserPrivilegeEntity;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public class UserPrivilegeDAO extends AbstractDAO<IUserPrivilegeEntity> implements IUserPrivilegeDAO {

    public UserPrivilegeDAO() {
        super(UserPrivilegeEntity.class);
    }

    @Override
    public IUserPrivilegeEntity generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException, NotSupportedException, NoSessionFoundException {
        return generateObject();
    }

    @Override
    public IUserPrivilegeEntity generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException {
        return new UserPrivilegeEntity();
    }
}
