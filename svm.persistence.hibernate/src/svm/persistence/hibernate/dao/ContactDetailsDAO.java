package svm.persistence.hibernate.dao;

import svm.persistence.DAOFactory;
import svm.persistence.abstraction.dao.IContactDetailsDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.IContactDetailsEntity;
import svm.persistence.hibernate.HibernateUtil;
import svm.persistence.hibernate.model.ContactDetailsEntity;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public class ContactDetailsDAO extends AbstractDAO<IContactDetailsEntity> implements IContactDetailsDAO {

    public ContactDetailsDAO() {
        super(ContactDetailsEntity.class);
    }

    @Override
    public IContactDetailsEntity generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException {
        IContactDetailsEntity entity = new ContactDetailsEntity();
        Integer sessionId = HibernateUtil.generateSessionId();
        entity.setLocationEntity(DAOFactory.getInstance().getLocationDAO().getById(sessionId, 1));
        HibernateUtil.closeSession(sessionId);
        return entity;
    }
}
