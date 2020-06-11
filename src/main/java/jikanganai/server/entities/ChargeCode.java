package jikanganai.server.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ChargeCode {
    @Id
    @GeneratedValue
    private String id;
    private String name;
    private String code;
    private String description;
    private boolean expired;
    private Date createdAt;
    private Date updatedAt;
}


