package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.ISubTeamEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
@javax.persistence.Table(name = "subteams", schema = "", catalog = "svm")
@Entity
public class SubTeamEntity implements ISubTeamEntity {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubTeamEntity that = (SubTeamEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    private ContestEntity contest;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = ContestEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "contest")
    public ContestEntity getContest() {
        return contest;
    }

    @Override
    public void setContest(ContestEntity contest) {
        this.contest = contest;
    }

    private TeamEntity team;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = TeamEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "team")
    public TeamEntity getTeam() {
        return team;
    }

    @Override
    public void setTeam(TeamEntity team) {
        this.team = team;
    }

    // TODO
    private List<SubTeamsHasMembersEntity> subTeamsHasMembers;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = SubTeamsHasMembersEntity.class, mappedBy = "pk.subTeam", fetch = FetchType.LAZY)
    public List<SubTeamsHasMembersEntity> getSubTeamsHasMembers() {
        return subTeamsHasMembers;
    }

    @Override
    public void setSubTeamsHasMembers(List<SubTeamsHasMembersEntity> subTeamsHasMembers) {
        this.subTeamsHasMembers = subTeamsHasMembers;
    }
}
