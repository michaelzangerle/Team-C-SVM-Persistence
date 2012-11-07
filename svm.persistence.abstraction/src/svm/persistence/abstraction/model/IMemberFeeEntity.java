package svm.persistence.abstraction.model;

import java.sql.Date;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IMemberFeeEntity extends IEntity {

    int getId();

    Date getDate();

    void setDate(Date date);

    float getAmount();

    void setAmount(float amount);

    void setMember(IMemberEntity member);

    IMemberEntity getMember();
}
