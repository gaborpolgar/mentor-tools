package org.training360.mentortools.trainingclass;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/trainingclass")
public class TrainingClassController {

    private TrainingClassService service;

    public TrainingClassController(TrainingClassService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TrainingClassDTO createTrainingClass(@RequestBody CreateTrainingClassCommand command) {
        return service.createTrainingClass(command);
    }

    @GetMapping
    public List<TrainingClassDTO> getTrainingClasses(){
        return service.getTrainingClasses();
    }

}
