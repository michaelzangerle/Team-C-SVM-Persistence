package svm.persistence.abstraction.model;

import svm.persistence.hibernate.model.DepartmentEntity;
import svm.persistence.hibernate.model.TeamEntity;

import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface ISportEntity extends IEntity {

    int getId();

    String getName();

    void setName(String name);

    String getAlias();

    void setAlias(String alias);

    String getDescription();

    void setDescription(String description);

    DepartmentEntity getDepartment();

    void setDepartment(DepartmentEntity department);

    List<TeamEntity> getTeams();

    void setTeams(List<TeamEntity> teams);
}
