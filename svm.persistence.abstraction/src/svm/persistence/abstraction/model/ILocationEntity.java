package svm.persistence.abstraction.model;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface ILocationEntity extends IEntity {

    int getId();

    String getCountryCode();

    void setCountryCode(String countrycode);

    String getPostalCode();

    void setPostalCode(String postalcode);

    String getPlaceName();

    void setPlaceName(String placename);

    String getDistrict();

    void setDistrict(String district);

    String getDistrictId();

    void setDistrictId(String districtid);

    String getProvince();

    void setProvince(String province);

    String getProvinceId();

    void setProvinceId(String provinceid);

    String getCommunity();

    void setCommunity(String community);

    String getCommunityId();

    void setCommunityId(String communityid);

    String getLatitude();

    void setLatitude(String latitude);

    String getLongitude();

    void setLongitude(String longitude);

    String getAccuracy();

    void setAccuracy(String accuracy);

}
