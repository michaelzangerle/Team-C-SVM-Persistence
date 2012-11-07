package svm.persistence.abstraction.model;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IMemberRoleEntity extends IEntity {

    int getId();

    int getAlias();

    void setAlias(int alias);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

}
