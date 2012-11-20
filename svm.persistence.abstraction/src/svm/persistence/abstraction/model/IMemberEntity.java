package svm.persistence.abstraction.model;

import java.sql.Date;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IMemberEntity extends IEntity {

    int getId();

    String getTitle();

    void setTitle(String title);

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    String getSocialNumber();

    void setSocialNumber(String socialNumber);

    Date getBirthDate();

    void setBirthDate(Date birthDate);

    String getGender();

    void setGender(String gender);

    Date getEntryDate();

    void setEntryDate(Date entryDate);

    String getAvatar();

    void setAvatar(String avatar);

    String getUrl();

    void setUrl(String url);

    String getUsername();

    void setUsername(String username);

    double getFee();

    void setFee(double fee);

    IContactDetailsEntity getContactDetails();

    void setContactDetails(IContactDetailsEntity contactDetails);

    List<IDepartmentsHasMembersEntity> getDepartmentHasMembers();

    void setDepartmentHasMembers(List<IDepartmentsHasMembersEntity> departmentHasMembers);

    List<ITeamsHasMembersEntity> getTeamsHasMembers();

    void setTeamsHasMembers(List<ITeamsHasMembersEntity> teamsHasMembers);

    List<IMemberFeeEntity> getFees();

    void setFees(List<IMemberFeeEntity> fees);

    List<ISubTeamsHasMembersEntity> getSubTeamHasMember();

    void setSubTeamHasMember(List<ISubTeamsHasMembersEntity> subTeamHasMember);

    List<IUserPrivilegeEntity> getPrivileges();

    void setPrivileges(List<IUserPrivilegeEntity> privileges);

    List<ITeamEntity> getTeamForContactPerson();

    void setTeamForContactPerson(List<ITeamEntity> teamForContactPerson);

    void setSport(ISportEntity sport);

    ISportEntity getSport();
}
