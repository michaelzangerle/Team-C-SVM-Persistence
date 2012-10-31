package svm.persistence.hibernate.model;

import svm.persistence.abstraction.model.IContactDetailsEntity;
import svm.persistence.abstraction.model.ILocationEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
@Table(name = "locations", schema = "", catalog = "svm")
@Entity
public class LocationEntity implements ILocationEntity {
    private Integer id = 0;

    @Override
    @Column(name = "id")
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String countryCode;

    @Override
    @Column(name = "countrycode")
    @Basic
    public String getCountryCode() {
        return countryCode;
    }

    @Override
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    private String postalCode;

    @Override
    @Column(name = "postalcode")
    @Basic
    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    private String placeName;

    @Override
    @Column(name = "placename")
    @Basic
    public String getPlaceName() {
        return placeName;
    }

    @Override
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    private String district;

    @Override
    @Column(name = "district")
    @Basic
    public String getDistrict() {
        return district;
    }

    @Override
    public void setDistrict(String district) {
        this.district = district;
    }

    private String districtId;

    @Override
    @Column(name = "districtid")
    @Basic
    public String getDistrictId() {
        return districtId;
    }

    @Override
    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    private String province;

    @Override
    @Column(name = "province")
    @Basic
    public String getProvince() {
        return province;
    }

    @Override
    public void setProvince(String province) {
        this.province = province;
    }

    private String provinceId;

    @Override
    @Column(name = "provinceid")
    @Basic
    public String getProvinceId() {
        return provinceId;
    }

    @Override
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    private String community;

    @Override
    @Column(name = "community")
    @Basic
    public String getCommunity() {
        return community;
    }

    @Override
    public void setCommunity(String community) {
        this.community = community;
    }

    private String communityId;

    @Override
    @Column(name = "communityid")
    @Basic
    public String getCommunityId() {
        return communityId;
    }

    @Override
    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    private String latitude;

    @Override
    @Column(name = "latitude")
    @Basic
    public String getLatitude() {
        return latitude;
    }

    @Override
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    private String longitude;

    @Override
    @Column(name = "longitude")
    @Basic
    public String getLongitude() {
        return longitude;
    }

    @Override
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    private String accuracy;

    @Override
    @Column(name = "accuracy")
    @Basic
    public String getAccuracy() {
        return accuracy;
    }

    @Override
    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    private List<IContactDetailsEntity> contactDetails;

    @Override
    @OneToMany(cascade = CascadeType.REMOVE, targetEntity = ContactDetailsEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "location")
    public List<IContactDetailsEntity> getContactDetails() {
        return contactDetails;
    }

    @Override
    public void setContactDetails(List<IContactDetailsEntity> contactDetails) {
        this.contactDetails = contactDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocationEntity that = (LocationEntity) o;

        if (id != that.id) return false;
        if (accuracy != null ? !accuracy.equals(that.accuracy) : that.accuracy != null) return false;
        if (community != null ? !community.equals(that.community) : that.community != null) return false;
        if (communityId != null ? !communityId.equals(that.communityId) : that.communityId != null) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (districtId != null ? !districtId.equals(that.districtId) : that.districtId != null) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (placeName != null ? !placeName.equals(that.placeName) : that.placeName != null) return false;
        if (postalCode != null ? !postalCode.equals(that.postalCode) : that.postalCode != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (provinceId != null ? !provinceId.equals(that.provinceId) : that.provinceId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (placeName != null ? placeName.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (districtId != null ? districtId.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (provinceId != null ? provinceId.hashCode() : 0);
        result = 31 * result + (community != null ? community.hashCode() : 0);
        result = 31 * result + (communityId != null ? communityId.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (accuracy != null ? accuracy.hashCode() : 0);
        return result;
    }
}
