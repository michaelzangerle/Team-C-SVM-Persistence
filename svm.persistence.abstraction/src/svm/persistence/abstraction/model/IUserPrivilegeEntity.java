package svm.persistence.abstraction.model;

import java.util.List;

/**
 * ProjectTeam: Team C
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

    List<IMemberEntity> getMembers();

    void setMembers(List<IMemberEntity> members);
}
