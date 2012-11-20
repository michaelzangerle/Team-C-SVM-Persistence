package svm.persistence.hibernate.dao;

import svm.persistence.DAOFactory;
import svm.persistence.abstraction.dao.IMemberDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NotSupportedException;
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

    @Override
    public IMemberEntity generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException {
        IMemberEntity entity = new MemberEntity();
        entity.setContactDetails(DAOFactory.getInstance().getContactDetailsDAO().generateObject(sessionId));

        return entity;
    }

    @Override
    public IMemberEntity generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException {
        throw new NotSupportedException();
    }
}
