package org.training360.mentortools.trainingclass;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
public class TrainingClassService {

    private ModelMapper modelMapper;
    private TrainingClassRepository repository;

      public TrainingClassDTO createTrainingClass(CreateTrainingClassCommand command) {
    TrainingClass trainingClass = new TrainingClass(command.getTitle());
    repository.save(trainingClass);
    return modelMapper.map(trainingClass, TrainingClassDTO.class);
    }
}
