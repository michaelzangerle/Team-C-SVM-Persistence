package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IMemberEntity;
import svm.persistence.abstraction.model.IUserPrivilegeEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
@Table(name = "userprivileges", schema = "", catalog = "svm")
@Entity
public class UserPrivilegeEntity implements IUserPrivilegeEntity {
    private int id;

    @Override
    @GeneratedValue
    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int alias;

    @Override
    @Column(name = "alias")
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
    @Column(name = "name")
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
    @Column(name = "description")
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

        UserPrivilegeEntity that = (UserPrivilegeEntity) o;

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

    private List<IMemberEntity> members;

    @ManyToMany(cascade = CascadeType.DETACH, targetEntity = MemberEntity.class)
    @JoinTable(name = "members_has_userpriviledges",
            joinColumns = {@JoinColumn(name = "userPriviledge")},
            inverseJoinColumns = {@JoinColumn(name = "member")})
    public List<IMemberEntity> getMembers() {
        return members;
    }

    @Override
    public void setMembers(List<IMemberEntity> members) {
        this.members = members;
    }
}
