package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IContestsHasTeamsEntity;
import svm.persistence.abstraction.model.ITeamEntity;
import svm.persistence.abstraction.model.ITeamsHasMembersEntity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
@javax.persistence.Table(name = "teams", schema = "", catalog = "svm")
@Entity
public class TeamEntity implements ITeamEntity {
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

    private Date founded;

    @Override
    @javax.persistence.Column(name = "founded")
    @Basic
    public Date getFounded() {
        return founded;
    }

    @Override
    public void setFounded(Date founded) {
        this.founded = founded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeamEntity that = (TeamEntity) o;

        if (id != that.id) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (founded != null ? !founded.equals(that.founded) : that.founded != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + (founded != null ? founded.hashCode() : 0);
        return result;
    }

    private SportEntity sport;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = SportEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "sport")
    public SportEntity getSport() {
        return sport;
    }

    @Override
    public void setSport(SportEntity sport) {
        this.sport = sport;
    }

    private MemberEntity contactPerson;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = MemberEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "contactperson")
    public MemberEntity getContactPerson() {
        return contactPerson;
    }

    @Override
    public void setContactPerson(MemberEntity contactPerson) {
        this.contactPerson = contactPerson;
    }

    private List<ITeamsHasMembersEntity> teamsHasMembers;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = TeamsHasMembersEntity.class, mappedBy = "pk.team", fetch = FetchType.LAZY)
    public List<ITeamsHasMembersEntity> getTeamsHasMembers() {
        return teamsHasMembers;
    }

    @Override
    public void setTeamsHasMembers(List<ITeamsHasMembersEntity> teamsHasMembers) {
        this.teamsHasMembers = teamsHasMembers;
    }

    private List<IContestsHasTeamsEntity> contestsHasTeams;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = ContestsHasTeamsEntity.class, mappedBy = "pk.team", fetch = FetchType.LAZY)
    public List<IContestsHasTeamsEntity> getContestsHasTeams() {
        return contestsHasTeams;
    }

    @Override
    public void setContestsHasTeams(List<IContestsHasTeamsEntity> contestsHasTeams) {
        this.contestsHasTeams = contestsHasTeams;
    }

    private List<SubTeamEntity> subTeams;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = SubTeamEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "team")
    public List<SubTeamEntity> getSubTeams() {
        return subTeams;
    }

    @Override
    public void setSubTeams(List<SubTeamEntity> subTeams) {
        this.subTeams = subTeams;
    }

    private List<ContestantEntity> contestants;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = ContestantEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "internalteam")
    public List<ContestantEntity> getContestants() {
        return contestants;
    }

    @Override
    public void setContestants(List<ContestantEntity> contestants) {
        this.contestants = contestants;
    }

    private TeamTypeEntity teamType;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = TeamTypeEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "teamtype")
    public TeamTypeEntity getTeamType() {
        return teamType;
    }

    @Override
    public void setTeamType(TeamTypeEntity teamType) {
        this.teamType = teamType;
    }
}
