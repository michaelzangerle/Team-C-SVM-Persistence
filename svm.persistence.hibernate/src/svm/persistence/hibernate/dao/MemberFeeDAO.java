package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.IMemberFeeDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.IMemberFeeEntity;
import svm.persistence.hibernate.model.MemberFeeEntity;

import javax.transaction.NotSupportedException;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public class MemberFeeDAO extends AbstractDAO<IMemberFeeEntity> implements IMemberFeeDAO {

    public MemberFeeDAO() {
        super(MemberFeeEntity.class);
    }

    @Override
    public IMemberFeeEntity generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException, NotSupportedException, NoSessionFoundException {
        return generateObject();
    }

    @Override
    public IMemberFeeEntity generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException {
        return new MemberFeeEntity();
    }
}