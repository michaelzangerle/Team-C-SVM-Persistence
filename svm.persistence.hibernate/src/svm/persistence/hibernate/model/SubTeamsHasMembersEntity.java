package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IMemberEntity;
import svm.persistence.abstraction.model.ISubTeamEntity;
import svm.persistence.abstraction.model.ISubTeamsHasMembersEntity;

import javax.persistence.*;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
@Entity
@javax.persistence.Table(name = "subteams_has_members", schema = "", catalog = "svm")
@AssociationOverrides({
        @AssociationOverride(name = "pk.member", joinColumns = @JoinColumn(name = "member")),
        @AssociationOverride(name = "pk.subTeam", joinColumns = @JoinColumn(name = "subteam"))
})
public class SubTeamsHasMembersEntity implements ISubTeamsHasMembersEntity {

    private SubTeamsHasMembersEntityPK pk = new SubTeamsHasMembersEntityPK();

    @EmbeddedId()
    public SubTeamsHasMembersEntityPK getPk() {
        return pk;
    }

    public void setPk(SubTeamsHasMembersEntityPK pk) {
        this.pk = pk;
    }

    @Override
    @Transient
    public ISubTeamEntity getSubTeam() {
        return getPk().getSubTeam();
    }

    @Override
    public void setSubTeam(ISubTeamEntity subTeam) {
        getPk().setSubTeam(subTeam);
    }

    @Override
    @Transient
    public IMemberEntity getMember() {
        return getPk().getMember();
    }

    @Override
    public void setMember(IMemberEntity member) {
        getPk().setMember(member);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubTeamsHasMembersEntity that = (SubTeamsHasMembersEntity) o;

        if (confirmed != that.confirmed) return false;
        if (getMember() != that.getMember()) return false;
        if (getSubTeam() != that.getSubTeam()) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getSubTeam().getId();
        result = 31 * result + getMember().getId();
        result = 31 * result + (confirmed ? 1 : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }

    @Override
    public Integer getId() {
        return 0;
    }

    public void setId(Integer id) {
    }
}
