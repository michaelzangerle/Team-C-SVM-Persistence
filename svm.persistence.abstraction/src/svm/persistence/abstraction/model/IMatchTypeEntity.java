package svm.persistence.abstraction.model;

import svm.persistence.abstraction.model.IEntity;
import svm.persistence.abstraction.model.IMatchRulesEntity;
import svm.persistence.hibernate.model.MatchRulesEntity;

import javax.persistence.*;
import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
public interface IMatchTypeEntity extends IEntity {

    int getId();

    int getAlias();

    void setAlias(int alias);

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    int getDraw();

    void setDraw(int draw);

    int getWin();

    void setWin(int win);

    int getLose();

    void setLose(int loose);

    List<IMatchRulesEntity> getMatchRules();

    void setMatchRules(List<IMatchRulesEntity> matchRules);
}
