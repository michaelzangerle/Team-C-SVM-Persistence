package svm.persistence.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
@javax.persistence.IdClass(svm.persistence.hibernate.model.TeamsHasMembersEntityPK.class)
@javax.persistence.Table(name = "teams_has_members", schema = "", catalog = "svm")
@Entity
public class TeamsHasMembersEntity {
    private int team;

    @javax.persistence.Column(name = "team")
    @Id
    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeamsHasMembersEntity that = (TeamsHasMembersEntity) o;

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
