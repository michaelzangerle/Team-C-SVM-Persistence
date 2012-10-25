package svm.persistence.hibernate.dao;

import svm.persistence.abstraction.dao.ISubTeamDAO;
import svm.persistence.abstraction.model.ISubTeamEntity;
import svm.persistence.hibernate.model.MemberEntity;

/**
 * Projectteam: Team C
 * Date: 25.10.12
 */
public class SubTeamDAO extends AbstractDAO<ISubTeamEntity> implements ISubTeamDAO {

    public SubTeamDAO() {
        super(MemberEntity.class);
    }
}
