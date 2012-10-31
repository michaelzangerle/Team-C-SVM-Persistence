package svm.persistence.abstraction.model;

/**
 * ProjectTeam: Team C
 * Date: 25.10.12
 */
public interface IPartResultEntity extends IEntity {

    Integer getId();

    float getResult();

    void setResult(float result);

    String getComment();

    void setComment(String comment);

    IContestantEntity getContestant();

    void setContestant(IContestantEntity contestant);
}
