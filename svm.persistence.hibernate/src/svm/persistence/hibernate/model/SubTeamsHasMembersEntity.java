package svm.persistence.hibernate.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
@javax.persistence.IdClass(SubTeamsHasMembersEntityPK.class)
@javax.persistence.Table(name = "subteams_has_members", schema = "", catalog = "svm")
@Entity
public class SubTeamsHasMembersEntity {
    private int subteam;

    @javax.persistence.Column(name = "subteam")
    @Id
    public int getSubteam() {
        return subteam;
    }

    public void setSubteam(int subteam) {
        this.subteam = subteam;
    }

    private int member;

    @javax.persistence.Column(name = "member")
    @Id
    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    private boolean confirmed;

    @javax.persistence.Column(name = "confirmed")
    @Basic
    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    private String comment;

    @javax.persistence.Column(name = "comment")
    @Basic
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubTeamsHasMembersEntity that = (SubTeamsHasMembersEntity) o;

        if (confirmed != that.confirmed) return false;
        if (member != that.member) return false;
        if (subteam != that.subteam) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subteam;
        result = 31 * result + member;
        result = 31 * result + (confirmed ? 1 : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }
}
