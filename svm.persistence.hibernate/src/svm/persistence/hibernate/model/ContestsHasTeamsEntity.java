package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IContestEntity;
import svm.persistence.abstraction.model.IContestsHasTeamsEntity;
import svm.persistence.abstraction.model.ITeamEntity;

import javax.persistence.*;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
@Entity
@javax.persistence.Table(name = "contests_has_teams", schema = "", catalog = "svm")
@AssociationOverrides({
        @AssociationOverride(name = "pk.team", joinColumns = @JoinColumn(name = "team")),
        @AssociationOverride(name = "pk.contest", joinColumns = @JoinColumn(name = "contest"))
})
public class ContestsHasTeamsEntity implements IContestsHasTeamsEntity {

    private ContestsHasTeamsEntityPK pk = new ContestsHasTeamsEntityPK();

    @EmbeddedId()
    public ContestsHasTeamsEntityPK getPk() {
        return pk;
    }

    public void setPk(ContestsHasTeamsEntityPK pk) {
        this.pk = pk;
    }

    @Override
    @Transient
    public ITeamEntity getTeam() {
        return getPk().getTeam();
    }

    @Override
    public void setTeam(ITeamEntity team) {
        getPk().setTeam(team);
    }

    @Override
    @Transient
    public IContestEntity getContest() {
        return getPk().getContest();
    }

    @Override
    public void setContest(IContestEntity team) {
        getPk().setContest(team);
    }

    private boolean confirmed;

    @Override
    @javax.persistence.Column(name = "confirmed")
    @Basic
    public boolean isConfirmed() {
        return confirmed;
    }

    @Override
    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    private String comment;

    @Override
    @javax.persistence.Column(name = "comment")
    @Basic
    public String getComment() {
        return comment;
    }

    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }

    private boolean paid;

    @Override
    @javax.persistence.Column(name = "paid")
    @Basic
    public boolean isPaid() {
        return paid;
    }

    @Override
    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContestsHasTeamsEntity that = (ContestsHasTeamsEntity) o;

        if (confirmed != that.confirmed) return false;
        if (getContest() != that.getContest()) return false;
        if (paid != that.paid) return false;
        if (getTeam() != that.getTeam()) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getContest().getId();
        result = 31 * result + getTeam().getId();
        result = 31 * result + (confirmed ? 1 : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (paid ? 1 : 0);
        return result;
    }

    @Override
    public int getId() {
        return 0;
    }

    private void setId(int id) {
    }
}
