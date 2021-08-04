package mentortools;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateTrainingClassCommand {

    private String title;
    private LocalDate start_date;
    private LocalDate end_date;



}
