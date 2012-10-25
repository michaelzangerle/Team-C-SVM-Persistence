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

    IDepartmentEntity getDepartment();

    void setDepartment(IDepartmentEntity department);

    List<ITeamEntity> getTeams();

    void setTeams(List<ITeamEntity> teams);
}
