package svm.persistence.abstraction.model;

import svm.persistence.hibernate.model.DepartmentsHasMembersEntity;
import svm.persistence.hibernate.model.TeamRuleEntity;
import svm.persistence.hibernate.model.TeamsHasMembersEntity;

import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IMemberRoleEntity extends IEntity {

    int getId();

    int getAlias();

    void setAlias(int alias);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    List<DepartmentsHasMembersEntity> getDepartmentMembers();

    void setDepartmentMembers(List<DepartmentsHasMembersEntity> departmentMembers);

    List<TeamsHasMembersEntity> getTeamMembers();

    void setTeamMembers(List<TeamsHasMembersEntity> teamMembers);

    List<TeamRuleEntity> getTeamRules();

    void setTeamRules(List<TeamRuleEntity> teamRules);
}
