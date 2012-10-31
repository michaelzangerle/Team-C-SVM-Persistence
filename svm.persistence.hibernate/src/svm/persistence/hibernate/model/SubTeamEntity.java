package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IContestEntity;
import svm.persistence.abstraction.model.ISubTeamEntity;
import svm.persistence.abstraction.model.ISubTeamsHasMembersEntity;
import svm.persistence.abstraction.model.ITeamEntity;

import javax.persistence.*;
import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
@Table(name = "subteams", schema = "", catalog = "svm")
@Entity
public class SubTeamEntity implements ISubTeamEntity {
    private Integer id = 0;

    @Override
    @GeneratedValue
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

    private IContestEntity contest;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = ContestEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "contest")
    public IContestEntity getContest() {
        return contest;
    }

    @Override
    public void setContest(IContestEntity contest) {
        this.contest = contest;
    }

    private ITeamEntity team;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = TeamEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "team")
    public ITeamEntity getTeam() {
        return team;
    }

    @Override
    public void setTeam(ITeamEntity team) {
        this.team = team;
    }

    private List<ISubTeamsHasMembersEntity> subTeamsHasMembers;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = SubTeamsHasMembersEntity.class, mappedBy = "pk.subTeam", fetch = FetchType.LAZY)
    public List<ISubTeamsHasMembersEntity> getSubTeamsHasMembers() {
        return subTeamsHasMembers;
    }

    @Override
    public void setSubTeamsHasMembers(List<ISubTeamsHasMembersEntity> subTeamsHasMembers) {
        this.subTeamsHasMembers = subTeamsHasMembers;
    }
}
