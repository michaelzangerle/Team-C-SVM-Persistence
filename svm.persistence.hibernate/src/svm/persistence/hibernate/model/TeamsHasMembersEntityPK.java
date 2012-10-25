package svm.persistence.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public class TeamsHasMembersEntityPK implements Serializable {
    private int team;

    @Id
    @Column(name = "team")
    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
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

        TeamsHasMembersEntityPK that = (TeamsHasMembersEntityPK) o;

        if (member != that.member) return false;
        if (team != that.team) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = team;
        result = 31 * result + member;
        return result;
    }
}
