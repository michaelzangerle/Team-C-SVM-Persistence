package svm.persistence.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public class SubTeamsHasMembersEntityPK implements Serializable {
    private int subteam;

    @Id
    @Column(name = "subteam")
    public int getSubteam() {
        return subteam;
    }

    public void setSubteam(int subteam) {
        this.subteam = subteam;
    }

    private int member;

    @Id
    @Column(name = "member")
    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubTeamsHasMembersEntityPK that = (SubTeamsHasMembersEntityPK) o;

        if (member != that.member) return false;
        if (subteam != that.subteam) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subteam;
        result = 31 * result + member;
        return result;
    }
}
