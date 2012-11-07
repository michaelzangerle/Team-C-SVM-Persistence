package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IContestEntity;
import svm.persistence.abstraction.model.ITeamEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
@Embeddable
public class ContestsHasTeamsEntityPK implements Serializable {
    private IContestEntity contest;

    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = ContestEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "contest")
    public IContestEntity getContest() {
        return contest;
    }

    public void setContest(IContestEntity contest) {
        this.contest = contest;
    }

    private ITeamEntity team;

    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = TeamEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "team")
    public ITeamEntity getTeam() {
        return team;
    }

    public void setTeam(ITeamEntity team) {
        this.team = team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContestsHasTeamsEntityPK that = (ContestsHasTeamsEntityPK) o;

        if (contest != that.contest) return false;
        if (team != that.team) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contest.getId();
        result = 31 * result + team.getId();
        return result;
    }
}
