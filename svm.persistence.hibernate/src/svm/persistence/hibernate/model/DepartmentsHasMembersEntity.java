package svm.persistence.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

// TODO Department has Members

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
@javax.persistence.IdClass(svm.persistence.hibernate.model.DepartmentsHasMembersEntityPK.class)
@javax.persistence.Table(name = "departments_has_members", schema = "", catalog = "svm")
@Entity
public class DepartmentsHasMembersEntity {
    private int department;

    @javax.persistence.Column(name = "department")
    @Id
    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
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

        DepartmentsHasMembersEntity that = (DepartmentsHasMembersEntity) o;

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
