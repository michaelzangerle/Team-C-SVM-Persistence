package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IDepartmentEntity;
import svm.persistence.abstraction.model.ISportEntity;
import svm.persistence.abstraction.model.ITeamEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
@javax.persistence.Table(name = "sports", schema = "", catalog = "svm")
@Entity
public class SportEntity implements ISportEntity {
    private Integer id;

    @Override
    @GeneratedValue
    @javax.persistence.Column(name = "id")
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    private String alias;

    @Override
    @javax.persistence.Column(name = "alias")
    @Basic
    public String getAlias() {
        return alias;
    }

    @Override
    public void setAlias(String alias) {
        this.alias = alias;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SportEntity that = (SportEntity) o;

        if (id != that.id) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    private IDepartmentEntity department;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = DepartmentEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "department")
    public IDepartmentEntity getDepartment() {
        return department;
    }

    @Override
    public void setDepartment(IDepartmentEntity department) {
        this.department = department;
    }

    private List<ITeamEntity> teams;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = TeamEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "sport")
    public List<ITeamEntity> getTeams() {
        return teams;
    }

    @Override
    public void setTeams(List<ITeamEntity> teams) {
        this.teams = teams;
    }
}
