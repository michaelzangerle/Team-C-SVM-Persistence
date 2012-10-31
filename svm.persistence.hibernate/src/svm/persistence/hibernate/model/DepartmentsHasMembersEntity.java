package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IDepartmentEntity;
import svm.persistence.abstraction.model.IDepartmentsHasMembersEntity;
import svm.persistence.abstraction.model.IMemberEntity;
import svm.persistence.abstraction.model.IMemberRoleEntity;

import javax.persistence.*;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
@Entity
@javax.persistence.Table(name = "departments_has_members", schema = "", catalog = "svm")
@AssociationOverrides({
        @AssociationOverride(name = "pk.member", joinColumns = @JoinColumn(name = "member")),
        @AssociationOverride(name = "pk.department", joinColumns = @JoinColumn(name = "department"))
})
public class DepartmentsHasMembersEntity implements IDepartmentsHasMembersEntity {

    private DepartmentsHasMembersEntityPK pk = new DepartmentsHasMembersEntityPK();

    @EmbeddedId()
    public DepartmentsHasMembersEntityPK getPk() {
        return pk;
    }

    public void setPk(DepartmentsHasMembersEntityPK pk) {
        this.pk = pk;
    }

    @Override
    @Transient
    public IDepartmentEntity getDepartment() {
        return getPk().getDepartment();
    }

    @Override
    public void setDepartment(IDepartmentEntity department) {
        this.getPk().setDepartment(department);
    }

    @Override
    @Transient
    public IMemberEntity getMember() {
        return getPk().getMember();
    }

    @Override
    public void setMember(IMemberEntity member) {
        this.getPk().setMember(member);
    }

    private IMemberRoleEntity memberRole;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = MemberRoleEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "memberRole")
    public IMemberRoleEntity getMemberRole() {
        return memberRole;
    }

    @Override
    public void setMemberRole(IMemberRoleEntity memberRole) {
        this.memberRole = memberRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentsHasMembersEntity that = (DepartmentsHasMembersEntity) o;

        if (getDepartment() != that.getDepartment()) return false;
        if (getMember() != that.getMember()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getDepartment().getId();
        result = 31 * result + getMember().getId();
        return result;
    }

    @Override
    public Integer getId() {
        return 0;
    }

    public void setId(Integer id) {
    }
}
