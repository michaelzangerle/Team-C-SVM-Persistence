package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.*;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
@Table(name = "matches", schema = "", catalog = "svm")
@Entity
public class MatchEntity implements IMatchEntity {
    private int id;

    @Override
    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    private Timestamp start;

    @Override
    @Column(name = "start")
    @Basic
    public Timestamp getStart() {
        return start;
    }

    @Override
    public void setStart(Timestamp start) {
        this.start = start;
    }

    private Timestamp end;

    @Override
    @Column(name = "end")
    @Basic
    public Timestamp getEnd() {
        return end;
    }

    @Override
    public void setEnd(Timestamp end) {
        this.end = end;
    }

    private boolean canceled;

    @Override
    @Column(name = "canceled")
    @Basic
    public boolean isCanceled() {
        return canceled;
    }

    @Override
    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }

    private String remarks;

    @Override
    @Column(name = "remarks")
    @Basic
    public String getRemarks() {
        return remarks;
    }

    @Override
    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    private IContactDetailsEntity contactDetails;

    @Override
    @ManyToOne(cascade = CascadeType.ALL, targetEntity = ContactDetailsEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "contactdetails")
    public IContactDetailsEntity getContactDetails() {
        return contactDetails;
    }

    @Override
    public void setContactDetails(IContactDetailsEntity contactDetails) {
        this.contactDetails = contactDetails;
    }

    private IContestEntity contest;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = ContestEntity.class)
    @JoinColumn(name = "contest")
    public IContestEntity getContest() {
        return contest;
    }

    @Override
    public void setContest(IContestEntity contest) {
        this.contest = contest;
    }

    private IMatchTypeEntity matchType;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = MatchTypeEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "matchType")
    public IMatchTypeEntity getMatchType() {
        return matchType;
    }

    @Override
    public void setMatchType(IMatchTypeEntity matchType) {
        this.matchType = matchType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MatchEntity that = (MatchEntity) o;

        if (canceled != that.canceled) return false;
        if (id != that.id) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (end != null ? !end.equals(that.end) : that.end != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
        if (start != null ? !start.equals(that.start) : that.start != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (start != null ? start.hashCode() : 0);
        result = 31 * result + (end != null ? end.hashCode() : 0);
        result = 31 * result + (canceled ? 1 : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    IExternalTeamEntity awayExternal;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = ExternalTeamEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "awayExternal")
    public IExternalTeamEntity getAwayExternal() {
        return awayExternal;
    }

    @Override
    public void setAwayExternal(IExternalTeamEntity awayExternal) {
        this.awayExternal = awayExternal;
    }

    IExternalTeamEntity homeExternal;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = ExternalTeamEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "homeExternal")
    public IExternalTeamEntity getHomeExternal() {
        return homeExternal;
    }

    @Override
    public void setHomeExternal(IExternalTeamEntity homeExternal) {
        this.homeExternal = homeExternal;
    }

    ITeamEntity awayInternal;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = TeamEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "awayInternal")
    public ITeamEntity getAwayInternal() {
        return awayInternal;
    }

    @Override
    public void setAwayInternal(ITeamEntity awayInternal) {
        this.awayInternal = awayInternal;
    }

    ITeamEntity homeInternal;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = TeamEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "homeInternal")
    public ITeamEntity getHomeInternal() {
        return homeInternal;
    }

    @Override
    public void setHomeInternal(ITeamEntity homeInternal) {
        this.homeInternal = homeInternal;
    }

    private int awayResult;

    @Override
    @Column(name = "awayResult")
    @Basic
    public int getAwayResult() {
        return awayResult;
    }

    @Override
    public void setAwayResult(int awayResult) {
        this.awayResult = awayResult;
    }

    private int homeResult;

    @Override
    @Column(name = "homeResult")
    @Basic
    public int getHomeResult() {
        return homeResult;
    }

    @Override
    public void setHomeResult(int homeResult) {
        this.homeResult = homeResult;
    }


}
