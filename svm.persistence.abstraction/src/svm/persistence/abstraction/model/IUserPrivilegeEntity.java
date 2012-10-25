package svm.persistence.abstraction.model;

import svm.persistence.hibernate.model.MemberEntity;

import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IUserPrivilegeEntity extends IEntity {

    int getId();

    int getAlias();

    void setAlias(int alias);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    List<MemberEntity> getMembers();

    void setMembers(List<MemberEntity> members);
}
