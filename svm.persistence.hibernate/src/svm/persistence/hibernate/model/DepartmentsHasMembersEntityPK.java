package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IDepartmentEntity;
import svm.persistence.abstraction.model.IMemberEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
@Embeddable
public class DepartmentsHasMembersEntityPK implements Serializable {
    private IDepartmentEntity department;

    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = DepartmentEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "department")
    public IDepartmentEntity getDepartment() {
        return department;
    }

    public void setDepartment(IDepartmentEntity department) {
        this.department = department;
    }

    private IMemberEntity member;

    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = MemberEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "member")
    public IMemberEntity getMember() {
        return member;
    }

    public void setMember(IMemberEntity member) {
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
        int result = getDepartment().getId();
        result = 31 * result + getMember().getId();
        return result;
    }
}
