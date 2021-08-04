package mentortools;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name =  "trainingclasses")
public class TrainingClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private LocalDate start_date;

    private LocalDate end_date;

    public TrainingClass(String title, LocalDate start_date, LocalDate end_date) {
        this.title = title;
        this.start_date = start_date;
        this.end_date = end_date;
    }
}
