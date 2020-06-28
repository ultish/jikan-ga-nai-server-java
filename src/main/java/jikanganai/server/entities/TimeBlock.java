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
@Table(name = "timeblocks")
public class TimeBlock {
    @Id
    @GeneratedValue()
    private Integer id;
    private Date startTime;
    private Integer minutes;
}
