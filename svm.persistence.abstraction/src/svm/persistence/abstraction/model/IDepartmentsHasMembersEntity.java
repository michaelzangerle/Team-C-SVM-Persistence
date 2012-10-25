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
    IDepartmentEntity getDepartment();

    void setDepartment(IDepartmentEntity department);

    IMemberEntity getMember();

    void setMember(IMemberEntity member);

    IMemberRoleEntity getMemberRole();

    void setMemberRole(IMemberRoleEntity memberRole);

    @Override
    int getId();
}
