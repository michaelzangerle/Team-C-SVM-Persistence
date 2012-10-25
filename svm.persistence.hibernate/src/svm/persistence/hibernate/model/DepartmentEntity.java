package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IContactDetailsEntity;
import svm.persistence.abstraction.model.IDepartmentEntity;

import javax.persistence.*;
import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
@javax.persistence.Table(name = "departments", schema = "", catalog = "svm")
@Entity
public class DepartmentEntity implements IDepartmentEntity {
    private int id;

    @Override
    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    private IContactDetailsEntity contactDetails;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = ContactDetailsEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "contactdetails")
    public IContactDetailsEntity getContactDetails() {
        return contactDetails;
    }

    @Override
    public void setContactDetails(IContactDetailsEntity contactDetails) {
        this.contactDetails = contactDetails;
    }

    private List<SportEntity> sports;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = SportEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "department")
    public List<SportEntity> getSports() {
        return sports;
    }

    @Override
    public void setSports(List<SportEntity> sports) {
        this.sports = sports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentEntity that = (DepartmentEntity) o;

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
}
