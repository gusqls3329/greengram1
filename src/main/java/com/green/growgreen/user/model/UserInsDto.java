package com.green.growgreen.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class UserInsDto {
    @JsonIgnore
    public Integer iuser;
    public String nm;
    public String uid;
    public String upw;
}
