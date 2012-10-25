package svm.persistence.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public class DepartmentsHasMembersEntityPK implements Serializable {
    private int department;

    @Id
    @Column(name = "department")
    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
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

        DepartmentsHasMembersEntityPK that = (DepartmentsHasMembersEntityPK) o;

        if (department != that.department) return false;
        if (member != that.member) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = department;
        result = 31 * result + member;
        return result;
    }
}
