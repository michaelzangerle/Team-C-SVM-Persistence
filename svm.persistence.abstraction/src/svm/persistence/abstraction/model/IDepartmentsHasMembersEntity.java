package svm.persistence.abstraction.model;

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
