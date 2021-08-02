package org.training360.mentortools.trainingclass;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class TrainingClassService {

    private ModelMapper modelMapper;
    private TrainingClassRepository repository;

    public TrainingClassDTO createTrainingClass(CreateTrainingClassCommand command) {
        TrainingClass trainingClass = new TrainingClass(command.getTitle());
        repository.save(trainingClass);
        return modelMapper.map(trainingClass, TrainingClassDTO.class);
    }

    public List<TrainingClassDTO> getTrainingClasses(){
        return repository.findAll().stream()
                .map(m->modelMapper.map(m, TrainingClassDTO.class))
                .collect(Collectors.toList());
    }
}
