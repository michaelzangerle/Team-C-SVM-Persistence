package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.IPartResultDAO;
import svm.persistence.abstraction.model.IPartResultEntity;
import svm.persistence.hibernate.model.PartResultEntity;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public class PartResultDAO extends AbstractDAO<IPartResultEntity> implements IPartResultDAO {

    public PartResultDAO() {
        super(PartResultEntity.class);
    }

    @Override
    public IPartResultEntity generateObject() throws InstantiationException, IllegalAccessException {
        IPartResultEntity entity = new PartResultEntity();
        return entity;
    }
}