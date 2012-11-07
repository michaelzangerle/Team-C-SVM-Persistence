package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.IMemberRoleDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.IMemberRoleEntity;
import svm.persistence.hibernate.model.MemberRoleEntity;

import javax.transaction.NotSupportedException;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public class MemberRoleDAO extends AbstractDAO<IMemberRoleEntity> implements IMemberRoleDAO {

    public MemberRoleDAO() {
        super(MemberRoleEntity.class);
    }

    @Override
    public IMemberRoleEntity generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException, NotSupportedException, NoSessionFoundException {
        return generateObject();
    }

    @Override
    public IMemberRoleEntity generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException {
        IMemberRoleEntity entity = new MemberRoleEntity();
        return entity;
    }
}