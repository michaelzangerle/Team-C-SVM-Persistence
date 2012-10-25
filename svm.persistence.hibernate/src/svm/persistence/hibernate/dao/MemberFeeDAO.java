package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.IMemberFeeDAO;
import svm.persistence.abstraction.model.IMemberFeeEntity;
import svm.persistence.hibernate.model.MemberFeeEntity;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public class MemberFeeDAO extends AbstractDAO<IMemberFeeEntity> implements IMemberFeeDAO {

    public MemberFeeDAO() {
        super(MemberFeeEntity.class);
    }
}