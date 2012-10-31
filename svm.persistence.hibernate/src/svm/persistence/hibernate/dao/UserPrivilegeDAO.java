package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.IUserPrivilegeDAO;

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
    public IUserPrivilegeEntity generateObject() throws InstantiationException, IllegalAccessException {
        return new UserPrivilegeEntity();
    }
}
