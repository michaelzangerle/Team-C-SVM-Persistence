package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.*;

import javax.persistence.*;
import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 24.10.12
 */
@Table(name = "contestants", schema = "", catalog = "svm")
@Entity
public class ContestantEntity implements IContestantEntity {
    private int id;

    @Override
    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    private ITeamEntity internalTeam;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = TeamEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "internalteam")
    public ITeamEntity getInternalTeam() {
        return internalTeam;
    }

    @Override
    public void setInternalTeam(ITeamEntity internalTeam) {
        this.internalTeam = internalTeam;
    }

    private IExternalTeamEntity externalTeam;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = ExternalTeamEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "externalteam")
    public IExternalTeamEntity getExternalTeam() {
        return externalTeam;
    }

    @Override
    public void setExternalTeam(IExternalTeamEntity externalTeam) {
        this.externalTeam = externalTeam;
    }

    private List<IPartResultEntity> partResults;

    @Override
    @OneToMany(cascade = CascadeType.REMOVE, targetEntity = PartResultEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "contestant")
    public List<IPartResultEntity> getPartResults() {
        return partResults;
    }

    @Override
    public void setPartResults(List<IPartResultEntity> partResults) {
        this.partResults = partResults;
    }

    // TODO WARUM ? MANY 2 MANY Match - Contestants

    private List<IMatchEntity> matches;

    @Override
    @ManyToMany(cascade = CascadeType.DETACH, targetEntity = MatchEntity.class)
    @JoinTable(name = "matches_has_contestants",
            joinColumns = {@JoinColumn(name = "contestant")},
            inverseJoinColumns = {@JoinColumn(name = "match")})
    public List<IMatchEntity> getMatches() {
        return matches;
    }

    @Override
    public void setMatches(List<IMatchEntity> matches) {
        this.matches = matches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContestantEntity that = (ContestantEntity) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
