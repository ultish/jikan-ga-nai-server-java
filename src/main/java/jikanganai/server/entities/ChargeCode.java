package jikanganai.server.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "chargecodes")
public class ChargeCode {
    @Id
    @GeneratedValue()
    private Integer id;

    private String name;

    private String code;

    private String description;

    private boolean expired;

    //    @Column(name = "\"createdAt\"")
    private Date createdAt;

    private Date updatedAt;
    //
    //    public ChargeCode() {
    //
    //    }
    //
    //    public ChargeCode(
    //        String id,
    //        String name,
    //        String code,
    //        String description,
    //        boolean expired,
    //        Date createdAt,
    //        Date updatedAt
    //    ) {
    //        this.id = id;
    //        this.name = name;
    //        this.code = code;
    //        this.description = description;
    //        this.expired = expired;
    //        this.createdAt = createdAt;
    //        this.updatedAt = updatedAt;
    //    }
    //
    //    public String getId() {
    //        return id;
    //    }
    //
    //    public void setId(String id) {
    //        this.id = id;
    //    }
    //
    //    public String getName() {
    //        return name;
    //    }
    //
    //    public void setName(String name) {
    //        this.name = name;
    //    }
    //
    //    public String getCode() {
    //        return code;
    //    }
    //
    //    public void setCode(String code) {
    //        this.code = code;
    //    }
    //
    //    public String getDescription() {
    //        return description;
    //    }
    //
    //    public void setDescription(String description) {
    //        this.description = description;
    //    }
    //
    //    public boolean isExpired() {
    //        return expired;
    //    }
    //
    //    public void setExpired(boolean expired) {
    //        this.expired = expired;
    //    }
    //
    //    public Date getCreatedAt() {
    //        return createdAt;
    //    }
    //
    //    public void setCreatedAt(Date createdAt) {
    //        this.createdAt = createdAt;
    //    }
    //
    //    public Date getUpdatedAt() {
    //        return updatedAt;
    //    }
    //
    //    public void setUpdatedAt(Date updatedAt) {
    //        this.updatedAt = updatedAt;
    //    }
}


