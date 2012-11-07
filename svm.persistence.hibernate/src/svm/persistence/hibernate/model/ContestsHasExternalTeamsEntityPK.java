package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IContestEntity;
import svm.persistence.abstraction.model.IExternalTeamEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
@Embeddable
public class ContestsHasExternalTeamsEntityPK implements Serializable {
    private IContestEntity contest;

    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = ContestEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "contest")
    public IContestEntity getContest() {
        return contest;
    }

    public void setContest(IContestEntity contest) {
        this.contest = contest;
    }

    private IExternalTeamEntity externalTeam;

    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = ExternalTeamEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "team")
    public IExternalTeamEntity getExternalTeam() {
        return externalTeam;
    }

    public void setExternalTeam(IExternalTeamEntity externalTeam) {
        this.externalTeam = externalTeam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContestsHasExternalTeamsEntityPK that = (ContestsHasExternalTeamsEntityPK) o;

        if (contest != that.contest) return false;
        if (externalTeam != that.externalTeam) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getContest().getId();
        result = 31 * result + getExternalTeam().getId();
        return result;
    }
}
