package org.akaza.openclinica.service;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * A DTO for the OCUser entity.
 */
public class OCParticipantDTO extends AbstractAuditingDTO implements Serializable {

    private String firstName;

    private String email;

    private boolean inviteParticipant;

    private String mobilePhone;

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isInviteParticipant() {
        return inviteParticipant;
    }

    public void setInviteParticipant(boolean inviteParticipant) {
        this.inviteParticipant = inviteParticipant;
    }

}