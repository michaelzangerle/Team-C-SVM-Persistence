package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.IContactDetailsDAO;
import svm.persistence.abstraction.model.IContactDetailsEntity;
import svm.persistence.hibernate.model.ContactDetailsEntity;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public class ContactDetailsDAO extends AbstractDAO<IContactDetailsEntity> implements IContactDetailsDAO {

    public ContactDetailsDAO() {
        super(ContactDetailsEntity.class);
    }
}
