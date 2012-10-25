package svm.persistence.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
@javax.persistence.IdClass(svm.persistence.hibernate.model.MembersHasUserpriviledgesEntityPK.class)
@javax.persistence.Table(name = "members_has_userpriviledges", schema = "", catalog = "svm")
@Entity
public class MembersHasUserpriviledgesEntity {
    private int member;

    @javax.persistence.Column(name = "member")
    @Id
    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    private int userPriviledge;

    @javax.persistence.Column(name = "userPriviledge")
    @Id
    public int getUserPriviledge() {
        return userPriviledge;
    }

    public void setUserPriviledge(int userPriviledge) {
        this.userPriviledge = userPriviledge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MembersHasUserpriviledgesEntity that = (MembersHasUserpriviledgesEntity) o;

        if (member != that.member) return false;
        if (userPriviledge != that.userPriviledge) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = member;
        result = 31 * result + userPriviledge;
        return result;
    }
}
