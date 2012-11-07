package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.ILocationDAO;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.model.ILocationEntity;
import svm.persistence.hibernate.model.LocationEntity;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public class LocationDAO extends AbstractDAO<ILocationEntity> implements ILocationDAO {

    public LocationDAO() {
        super(LocationEntity.class);
    }

    @Override
    public ILocationEntity generateObject(Integer sessionId) throws InstantiationException, IllegalAccessException, NoSessionFoundException {
        return new LocationEntity();
    }
}
