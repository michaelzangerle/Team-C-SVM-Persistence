package svm.persistence.abstraction.model;

import svm.persistence.abstraction.model.IDepartmentEntity;
import svm.persistence.abstraction.model.IEntity;
import svm.persistence.abstraction.model.IMemberEntity;
import svm.persistence.abstraction.model.IMemberRoleEntity;
import svm.persistence.hibernate.model.MemberRoleEntity;

import javax.persistence.*;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public interface IDepartmentsHasMembersEntity extends IEntity {
    @Transient
    IDepartmentEntity getDepartment();

    void setDepartment(IDepartmentEntity department);

    @Transient
    IMemberEntity getMember();

    void setMember(IMemberEntity member);

    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = MemberRoleEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "memberRole")
    IMemberRoleEntity getMemberRole();

    void setMemberRole(IMemberRoleEntity memberRole);

    @Override
    int getId();
}
