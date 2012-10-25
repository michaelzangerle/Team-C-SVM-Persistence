package svm.persistence.abstraction.model;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public interface IPartResultEntity extends IEntity {

    int getId();

    float getResult();

    void setResult(float result);

    String getComment();

    void setComment(String comment);
}
