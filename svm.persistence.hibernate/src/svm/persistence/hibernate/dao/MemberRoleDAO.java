package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.IMemberRoleDAO;
import svm.persistence.abstraction.model.IMemberRoleEntity;
import svm.persistence.hibernate.model.MemberRoleEntity;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public class MemberRoleDAO  extends AbstractDAO<IMemberRoleEntity> implements IMemberRoleDAO {

    public MemberRoleDAO() {
        super(MemberRoleEntity.class);
    }
}