package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IMatchRulesEntity;
import svm.persistence.abstraction.model.IMatchTypeEntity;

import javax.persistence.*;
import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
@javax.persistence.Table(name = "matchtypes", schema = "", catalog = "svm")
@Entity
public class MatchTypeEntity implements IMatchTypeEntity {
    private Integer id;

    @Override
    @GeneratedValue
    @javax.persistence.Column(name = "id")
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private int alias;

    @Override
    @javax.persistence.Column(name = "alias")
    @Basic
    public int getAlias() {
        return alias;
    }

    @Override
    public void setAlias(int alias) {
        this.alias = alias;
    }

    private String name;

    @Override
    @javax.persistence.Column(name = "name")
    @Basic
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    private String description;

    @Override
    @javax.persistence.Column(name = "description")
    @Basic
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    private int draw;

    @Override
    @javax.persistence.Column(name = "draw")
    @Basic
    public int getDraw() {
        return draw;
    }

    @Override
    public void setDraw(int draw) {
        this.draw = draw;
    }

    private int win;

    @Override
    @javax.persistence.Column(name = "win")
    @Basic
    public int getWin() {
        return win;
    }

    @Override
    public void setWin(int win) {
        this.win = win;
    }

    private int lose;

    @Override
    @javax.persistence.Column(name = "loose")
    @Basic
    public int getLose() {
        return lose;
    }

    @Override
    public void setLose(int lose) {
        this.lose = lose;
    }

    private List<IMatchRulesEntity> matchRules;

    @Override
    @OneToMany(cascade = CascadeType.REMOVE, targetEntity = MatchRulesEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "matchType")
    public List<IMatchRulesEntity> getMatchRules() {
        return matchRules;
    }

    @Override
    public void setMatchRules(List<IMatchRulesEntity> matchRules) {
        this.matchRules = matchRules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MatchTypeEntity that = (MatchTypeEntity) o;

        if (alias != that.alias) return false;
        if (draw != that.draw) return false;
        if (id != that.id) return false;
        if (lose != that.lose) return false;
        if (win != that.win) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + alias;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + draw;
        result = 31 * result + win;
        result = 31 * result + lose;
        return result;
    }
}
