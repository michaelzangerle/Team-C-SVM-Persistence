package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.IMemberDAO;
import svm.persistence.abstraction.model.IMemberEntity;
import svm.persistence.hibernate.model.MemberEntity;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public class MemberDAO extends AbstractDAO<IMemberEntity> implements IMemberDAO {

    public MemberDAO() {
        super(MemberEntity.class);
    }
}
