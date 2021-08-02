package org.training360.mentortools.trainingclass;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
//@Table(name =  "traingingclasses")
public class TrainingClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private LocalDate start_date;

    private LocalDate end_date;

    public TrainingClass(String title) {
    }
}
