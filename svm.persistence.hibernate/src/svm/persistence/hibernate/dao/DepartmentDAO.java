package svm.persistence.hibernate.dao;

import svm.persistence.DAOFactory;
import svm.persistence.abstraction.dao.IDepartmentDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.IDepartmentEntity;
import svm.persistence.hibernate.model.DepartmentEntity;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public class DepartmentDAO extends AbstractDAO<IDepartmentEntity> implements IDepartmentDAO {

    public DepartmentDAO() {
        super(DepartmentEntity.class);
    }

    @Override
    public IDepartmentEntity generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException, NoSessionFoundException {
        IDepartmentEntity entity = new DepartmentEntity();
        entity.setContactDetails(DAOFactory.getInstance().getContactDetailsDAO().generateObject(sessionId));
        return entity;
    }
}
