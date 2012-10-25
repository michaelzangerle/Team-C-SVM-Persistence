package svm.persistence.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public class MembersHasUserpriviledgesEntityPK implements Serializable {
    private int member;

    @Id
    @Column(name = "member")
    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    private int userPriviledge;

    @Id
    @Column(name = "userPriviledge")
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

        MembersHasUserpriviledgesEntityPK that = (MembersHasUserpriviledgesEntityPK) o;

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
