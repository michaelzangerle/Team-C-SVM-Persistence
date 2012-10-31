package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
@Table(name = "contests", schema = "", catalog = "svm")
@Entity
public class ContestEntity implements IContestEntity {

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

    private Date start;

    @Override
    @Column(name = "start")
    @Basic
    public Date getStart() {
        return start;
    }

    @Override
    public void setStart(Date start) {
        this.start = start;
    }

    private Date end;

    @Override
    @Column(name = "end")
    @Basic
    public Date getEnd() {
        return end;
    }

    @Override
    public void setEnd(Date end) {
        this.end = end;
    }

    private float fee;

    @Override
    @Column(name = "fee")
    @Basic
    public float getFee() {
        return fee;
    }

    @Override
    public void setFee(float fee) {
        this.fee = fee;
    }

    private IContactDetailsEntity contactDetails;

    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = ContactDetailsEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "contactdetails")
    public IContactDetailsEntity getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(IContactDetailsEntity contactDetails) {
        this.contactDetails = contactDetails;
    }

    private List<ContestsHasExternalTeamsEntity> externalTeams;

    @OneToMany(cascade = CascadeType.DETACH, targetEntity = ContestsHasExternalTeamsEntity.class, mappedBy = "pk.contest", fetch = FetchType.LAZY)
    public List<ContestsHasExternalTeamsEntity> getExternalTeams() {
        return externalTeams;
    }

    public void setExternalTeams(List<ContestsHasExternalTeamsEntity> externalTeams) {
        this.externalTeams = externalTeams;
    }

    private List<IContestsHasTeamsEntity> contestsHasTeams;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = ContestsHasTeamsEntity.class, mappedBy = "pk.contest", fetch = FetchType.LAZY)
    public List<IContestsHasTeamsEntity> getContestsHasTeams() {
        return contestsHasTeams;
    }

    @Override
    public void setContestsHasTeams(List<IContestsHasTeamsEntity> contestsHasTeams) {
        this.contestsHasTeams = contestsHasTeams;
    }

    private List<IContestsHasExternalTeamsEntity> contestsHasExternalTeams;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = ContestsHasExternalTeamsEntity.class, mappedBy = "pk.contest", fetch = FetchType.LAZY)
    public List<IContestsHasExternalTeamsEntity> getContestsHasExternalTeams() {
        return contestsHasExternalTeams;
    }

    @Override
    public void setContestsHasExternalTeams(List<IContestsHasExternalTeamsEntity> contestsHasExternalTeams) {
        this.contestsHasExternalTeams = contestsHasExternalTeams;
    }

    // TODO WARUM ? MANY 2 MANY Match - Contest

    public List<IMatchEntity> matches;

    @ManyToMany(cascade = CascadeType.DETACH, targetEntity = MatchEntity.class)
    @JoinTable(name = "contests_has_matches",
            joinColumns = {@JoinColumn(name = "contest")},
            inverseJoinColumns = {@JoinColumn(name = "match")})
    public List<IMatchEntity> getMatches() {
        return matches;
    }

    public void setMatches(List<IMatchEntity> matches) {
        this.matches = matches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContestEntity that = (ContestEntity) o;

        if (Float.compare(that.fee, fee) != 0) return false;
        if (id != that.id) return false;
        if (end != null ? !end.equals(that.end) : that.end != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (start != null ? !start.equals(that.start) : that.start != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (start != null ? start.hashCode() : 0);
        result = 31 * result + (end != null ? end.hashCode() : 0);
        result = 31 * result + (fee != +0.0f ? Float.floatToIntBits(fee) : 0);
        return result;
    }
}
