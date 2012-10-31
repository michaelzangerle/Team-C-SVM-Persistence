package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IContactDetailsEntity;
import svm.persistence.abstraction.model.IContestantEntity;
import svm.persistence.abstraction.model.IContestsHasExternalTeamsEntity;
import svm.persistence.abstraction.model.IExternalTeamEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
@Table(name = "externalteams", schema = "", catalog = "svm")
@Entity
public class ExternalTeamEntity implements IExternalTeamEntity {
    private Integer id = 0;

    @Override
    @Column(name = "id")
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    private String alias;

    @Override
    @Column(name = "alias")
    @Basic
    public String getAlias() {
        return alias;
    }

    @Override
    public void setAlias(String alias) {
        this.alias = alias;
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

    private List<IContestantEntity> contestant;

    @Override
    @OneToMany(cascade = CascadeType.REMOVE, targetEntity = ContestantEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "externalteam")
    public List<IContestantEntity> getContestant() {
        return contestant;
    }

    @Override
    public void setContestant(List<IContestantEntity> contestant) {
        this.contestant = contestant;
    }

    private List<IContestsHasExternalTeamsEntity> externalTeams;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = ContestsHasExternalTeamsEntity.class, mappedBy = "pk.externalTeam", fetch = FetchType.LAZY)
    public List<IContestsHasExternalTeamsEntity> getExternalTeams() {
        return externalTeams;
    }

    @Override
    public void setExternalTeams(List<IContestsHasExternalTeamsEntity> externalTeams) {
        this.externalTeams = externalTeams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExternalTeamEntity that = (ExternalTeamEntity) o;

        if (id != that.id) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        return result;
    }
}
