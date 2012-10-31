package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
@Table(name = "members", schema = "", catalog = "svm")
@Entity
public class MemberEntity implements IMemberEntity {
    private Integer id = 0;

    @Override
    @GeneratedValue
    @Column(name = "id")
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String title;

    @Override
    @Column(name = "title")
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
    @Column(name = "firstname")
    @Basic
    public String getFirstName() {
        return firstname;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    private String lastname;

    @Override
    @Column(name = "lastname")
    @Basic
    public String getLastName() {
        return lastname;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    private String socialnumber;

    @Override
    @Column(name = "socialnumber")
    @Basic
    public String getSocialNumber() {
        return socialnumber;
    }

    @Override
    public void setSocialNumber(String socialNumber) {
        this.socialnumber = socialNumber;
    }

    private Date birthdate;

    @Override
    @Column(name = "birthdate")
    @Basic
    public Date getBirthDate() {
        return birthdate;
    }

    @Override
    public void setBirthDate(Date birthDate) {
        this.birthdate = birthDate;
    }

    private String gender;

    @Override
    @Column(name = "gender")
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
    @Column(name = "entrydate")
    @Basic
    public Date getEntryDate() {
        return entrydate;
    }

    @Override
    public void setEntryDate(Date entryDate) {
        this.entrydate = entryDate;
    }

    private String avatar;

    @Override
    @Column(name = "avatar")
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
    @Column(name = "url")
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
    @Column(name = "username")
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
    @Column(name = "fee")
    @Basic
    public double getFee() {
        return fee;
    }

    @Override
    public void setFee(double fee) {
        this.fee = fee;
    }

    private IContactDetailsEntity contactDetails;

    @Override
    @ManyToOne(cascade = CascadeType.ALL, targetEntity = ContactDetailsEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "contactdetails")
    public IContactDetailsEntity getContactDetails() {
        return contactDetails;
    }

    @Override
    public void setContactDetails(IContactDetailsEntity contactDetails) {
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

    private List<IMemberFeeEntity> fees;

    @Override
    @OneToMany(cascade = CascadeType.ALL, targetEntity = MemberFeeEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "member")
    public List<IMemberFeeEntity> getFees() {
        return fees;
    }

    @Override
    public void setFees(List<IMemberFeeEntity> fees) {
        this.fees = fees;
    }

    private List<ISubTeamsHasMembersEntity> subTeamHasMember;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = SubTeamsHasMembersEntity.class, mappedBy = "pk.member", fetch = FetchType.LAZY)
    public List<ISubTeamsHasMembersEntity> getSubTeamHasMember() {
        return subTeamHasMember;
    }

    @Override
    public void setSubTeamHasMember(List<ISubTeamsHasMembersEntity> subTeamHasMember) {
        this.subTeamHasMember = subTeamHasMember;
    }

    private List<IUserPrivilegeEntity> privileges;

    @Override
    @ManyToMany(cascade = CascadeType.DETACH, targetEntity = UserPrivilegeEntity.class)
    @JoinTable(name = "members_has_userPriviledges",
            joinColumns = {@JoinColumn(name = "member")},
            inverseJoinColumns = {@JoinColumn(name = "userPriviledge")})
    public List<IUserPrivilegeEntity> getPrivileges() {
        return privileges;
    }

    private List<ITeamEntity> teamForContactPerson;

    @Override
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = TeamEntity.class, mappedBy = "contactPerson", fetch = FetchType.LAZY)
    public List<ITeamEntity> getTeamForContactPerson() {
        return teamForContactPerson;
    }

    @Override
    public void setTeamForContactPerson(List<ITeamEntity> teamForContactPerson) {
        this.teamForContactPerson = teamForContactPerson;
    }

    @Override
    public void setPrivileges(List<IUserPrivilegeEntity> privileges) {
        this.privileges = privileges;
    }
}
