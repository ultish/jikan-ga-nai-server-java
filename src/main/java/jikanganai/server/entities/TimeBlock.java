package jikanganai.server.entities;

import lombok.*;

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
    //    private Integer minutes;
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Integer trackedtaskId;
}
