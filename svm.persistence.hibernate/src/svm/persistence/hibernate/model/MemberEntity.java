package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IDepartmentsHasMembersEntity;
import svm.persistence.abstraction.model.IMemberEntity;
import svm.persistence.abstraction.model.ITeamsHasMembersEntity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
@javax.persistence.Table(name = "members", schema = "", catalog = "svm")
@Entity
public class MemberEntity implements IMemberEntity {
    private int id;

    @Override
    @GeneratedValue
    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String title;

    @Override
    @javax.persistence.Column(name = "title")
    @Basic
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    private String firstname;

    @Override
    @javax.persistence.Column(name = "firstname")
    @Basic
    public String getFirstname() {
        return firstname;
    }

    @Override
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    private String lastname;

    @Override
    @javax.persistence.Column(name = "lastname")
    @Basic
    public String getLastname() {
        return lastname;
    }

    @Override
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    private String socialnumber;

    @Override
    @javax.persistence.Column(name = "socialnumber")
    @Basic
    public String getSocialnumber() {
        return socialnumber;
    }

    @Override
    public void setSocialnumber(String socialnumber) {
        this.socialnumber = socialnumber;
    }

    private Date birthdate;

    @Override
    @javax.persistence.Column(name = "birthdate")
    @Basic
    public Date getBirthdate() {
        return birthdate;
    }

    @Override
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    private String gender;

    @Override
    @javax.persistence.Column(name = "gender")
    @Basic
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    private Date entrydate;

    @Override
    @javax.persistence.Column(name = "entrydate")
    @Basic
    public Date getEntrydate() {
        return entrydate;
    }

    @Override
    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    private String avatar;

    @Override
    @javax.persistence.Column(name = "avatar")
    @Basic
    public String getAvatar() {
        return avatar;
    }

    @Override
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    private String url;

    @Override
    @javax.persistence.Column(name = "url")
    @Basic
    public String getUrl() {
        return url;
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    private String username;

    @Override
    @javax.persistence.Column(name = "username")
    @Basic
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    private double fee;

    @Override
    @javax.persistence.Column(name = "fee")
    @Basic
    public double getFee() {
        return fee;
    }

    @Override
    public void setFee(double fee) {
        this.fee = fee;
    }

    private ContactDetailsEntity contactDetails;

    @Override
    @ManyToOne(cascade = CascadeType.DETACH, targetEntity = ContactDetailsEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "contactdetails")
    public ContactDetailsEntity getContactDetails() {
        return contactDetails;
    }

    @Override
    public void setContactDetails(ContactDetailsEntity contactDetails) {
        this.contactDetails = contactDetails;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MemberEntity that = (MemberEntity) o;

        if (Double.compare(that.fee, fee) != 0) return false;
        if (id != that.id) return false;
        if (avatar != null ? !avatar.equals(that.avatar) : that.avatar != null) return false;
        if (birthdate != null ? !birthdate.equals(that.birthdate) : that.birthdate != null) return false;
        if (entrydate != null ? !entrydate.equals(that.entrydate) : that.entrydate != null) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (socialnumber != null ? !socialnumber.equals(that.socialnumber) : that.socialnumber != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (socialnumber != null ? socialnumber.hashCode() : 0);
        result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (entrydate != null ? entrydate.hashCode() : 0);
        result = 31 * result + (avatar != null ? avatar.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        temp = fee != +0.0d ? Double.doubleToLongBits(fee) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    private List<IDepartmentsHasMembersEntity> departmentHasMembers;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = DepartmentsHasMembersEntity.class, mappedBy = "pk.member", fetch = FetchType.LAZY)
    public List<IDepartmentsHasMembersEntity> getDepartmentHasMembers() {
        return departmentHasMembers;
    }

    @Override
    public void setDepartmentHasMembers(List<IDepartmentsHasMembersEntity> departmentHasMembers) {
        this.departmentHasMembers = departmentHasMembers;
    }

    private List<ITeamsHasMembersEntity> teamsHasMembers;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = TeamsHasMembersEntity.class, mappedBy = "pk.member", fetch = FetchType.LAZY)
    public List<ITeamsHasMembersEntity> getTeamsHasMembers() {
        return teamsHasMembers;
    }

    @Override
    public void setTeamsHasMembers(List<ITeamsHasMembersEntity> teamsHasMembers) {
        this.teamsHasMembers = teamsHasMembers;
    }

    private List<TeamEntity> teams;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = TeamEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "contactperson")
    public List<TeamEntity> getTeams() {
        return teams;
    }

    @Override
    public void setTeams(List<TeamEntity> teams) {
        this.teams = teams;
    }

    private List<MemberFeeEntity> fees;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = MemberFeeEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "member")
    public List<MemberFeeEntity> getFees() {
        return fees;
    }

    @Override
    public void setFees(List<MemberFeeEntity> fees) {
        this.fees = fees;
    }

    // TODO

    private List<SubTeamsHasMembersEntity> subteamHasMember;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = SubTeamsHasMembersEntity.class, mappedBy = "pk.member", fetch = FetchType.LAZY)
    public List<SubTeamsHasMembersEntity> getSubteamHasMember() {
        return subteamHasMember;
    }

    @Override
    public void setSubteamHasMember(List<SubTeamsHasMembersEntity> subteamHasMember) {
        this.subteamHasMember = subteamHasMember;
    }

    // TODO

    private List<MembersHasUserpriviledgesEntity> priviledges;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = MembersHasUserpriviledgesEntity.class, mappedBy = "pk.member", fetch = FetchType.LAZY)
    public List<MembersHasUserpriviledgesEntity> getPriviledges() {
        return priviledges;
    }

    @Override
    public void setPriviledges(List<MembersHasUserpriviledgesEntity> priviledges) {
        this.priviledges = priviledges;
    }
}
