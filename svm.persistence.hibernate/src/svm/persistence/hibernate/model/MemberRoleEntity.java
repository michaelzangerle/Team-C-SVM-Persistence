package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IMemberRoleEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
@javax.persistence.Table(name = "memberroles", schema = "", catalog = "svm")
@Entity
public class MemberRoleEntity implements IMemberRoleEntity {
    private int id;

    @Override
    @GeneratedValue
    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int alias;

    @Override
    @javax.persistence.Column(name = "alias")
    @Basic
    public int getAlias() {
        return alias;
    }

    @Override
    public void setAlias(int alias) {
        this.alias = alias;
    }

    private String name;

    @Override
    @javax.persistence.Column(name = "name")
    @Basic
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    private String description;

    @Override
    @javax.persistence.Column(name = "description")
    @Basic
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }


    // TODO

    private List<DepartmentsHasMembersEntity> departmentMembers;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = DepartmentsHasMembersEntity.class, mappedBy = "pk.department", fetch = FetchType.LAZY)
    public List<DepartmentsHasMembersEntity> getDepartmentMembers() {
        return departmentMembers;
    }

    @Override
    public void setDepartmentMembers(List<DepartmentsHasMembersEntity> departmentMembers) {
        this.departmentMembers = departmentMembers;
    }

    // TODO

    private List<TeamsHasMembersEntity> teamMembers;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = TeamsHasMembersEntity.class, mappedBy = "pk.memberRole", fetch = FetchType.LAZY)
    public List<TeamsHasMembersEntity> getTeamMembers() {
        return teamMembers;
    }

    @Override
    public void setTeamMembers(List<TeamsHasMembersEntity> teamMembers) {
        this.teamMembers = teamMembers;
    }

    private List<TeamRuleEntity> teamRules;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = TeamRuleEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "memberRole")
    public List<TeamRuleEntity> getTeamRules() {
        return teamRules;
    }

    @Override
    public void setTeamRules(List<TeamRuleEntity> teamRules) {
        this.teamRules = teamRules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MemberRoleEntity that = (MemberRoleEntity) o;

        if (alias != that.alias) return false;
        if (id != that.id) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + alias;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }


}
