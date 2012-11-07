package svm.persistence.hibernate.dao;

import svm.persistence.DAOFactory;
import svm.persistence.abstraction.dao.IExternalTeamDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.IExternalTeamEntity;
import svm.persistence.hibernate.model.ExternalTeamEntity;

import javax.transaction.NotSupportedException;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public class ExternalTeamDAO extends AbstractDAO<IExternalTeamEntity> implements IExternalTeamDAO {

    public ExternalTeamDAO() {
        super(ExternalTeamEntity.class);
    }

    @Override
    public IExternalTeamEntity generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException {
        IExternalTeamEntity entity = new ExternalTeamEntity();
        entity.setContactDetails(DAOFactory.getInstance().getContactDetailsDAO().generateObject(sessionId));
        return entity;
    }

    @Override
    public IExternalTeamEntity generateObject() throws InstantiationException, IllegalAccessException, NoSessionFoundException, NotSupportedException {
        throw new NotSupportedException("");
    }
}
