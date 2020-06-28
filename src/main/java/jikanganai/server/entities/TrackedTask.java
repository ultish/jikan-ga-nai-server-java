package jikanganai.server.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "trackedtasks")
public class TrackedTask {
    @Id
    @GeneratedValue()
    private Integer id;
    private String notes;
    @ManyToMany
    @JoinTable(name = "taskcodes", joinColumns = @JoinColumn(name =
        "trackedtaskId"),
        inverseJoinColumns = @JoinColumn(name = "chargecodeId"))
    private List<ChargeCode> chargeCodes;
    //    private List<TimeBlock> timeBlocks;
    private Date createdAt;
    private Boolean overtimeEnabled;

}
