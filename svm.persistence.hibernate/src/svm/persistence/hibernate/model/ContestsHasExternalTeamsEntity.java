package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IContestEntity;
import svm.persistence.abstraction.model.IContestsHasExternalTeamsEntity;
import svm.persistence.abstraction.model.IExternalTeamEntity;

import javax.persistence.*;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
@Entity
@javax.persistence.Table(name = "contests_has_externalteams", schema = "", catalog = "svm")
@AssociationOverrides({
        @AssociationOverride(name = "pk.contest", joinColumns = @JoinColumn(name = "contest")),
        @AssociationOverride(name = "pk.externalTeam", joinColumns = @JoinColumn(name = "externalteam"))
})
public class ContestsHasExternalTeamsEntity implements IContestsHasExternalTeamsEntity {

    private ContestsHasExternalTeamsEntityPK pk = new ContestsHasExternalTeamsEntityPK();

    @EmbeddedId()
    public ContestsHasExternalTeamsEntityPK getPk() {
        return pk;
    }

    public void setPk(ContestsHasExternalTeamsEntityPK pk) {
        this.pk = pk;
    }

    @Override
    @Transient
    public IContestEntity getContest() {
        return getPk().getContest();
    }

    @Override
    public void setContest(IContestEntity contest) {
        getPk().setContest(contest);
    }

    @Override
    @Transient
    public IExternalTeamEntity getExternalTeam() {
        return getPk().getExternalTeam();
    }

    @Override
    public void setExternalTeam(IExternalTeamEntity externalTeam) {
        getPk().setExternalTeam(externalTeam);
    }

    private float paid;

    @Override
    @javax.persistence.Column(name = "paid")
    @Basic
    public float getPaid() {
        return paid;
    }

    @Override
    public void setPaid(float paid) {
        this.paid = paid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContestsHasExternalTeamsEntity that = (ContestsHasExternalTeamsEntity) o;

        if (getContest() != that.getContest()) return false;
        if (getExternalTeam() != that.getExternalTeam()) return false;
        if (Float.compare(that.paid, paid) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getContest().getId();
        result = 31 * result + getExternalTeam().getId();
        result = 31 * result + (paid != +0.0f ? Float.floatToIntBits(paid) : 0);
        return result;
    }

    @Override
    public int getId() {
        return 0;
    }

    public void setId(int id){
    }
}
