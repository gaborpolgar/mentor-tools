package mentortools;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mentortools")
public class TrainingClassController {

    private TrainingClassService service;

    public TrainingClassController(TrainingClassService service) {
        this.service = service;
    }

    @PostMapping("/trainingclass")
    public TrainingClassDTO createTrainingClass(@RequestBody CreateTrainingClassCommand command) {
        return service.createTrainingClass(command);
    }

    @GetMapping("/trainingclass")
    public List<TrainingClassDTO> getTrainingClasses(){
        return service.getTrainingClasses();
    }

}
