package mentortools;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class TrainingClassService {

    private ModelMapper modelMapper;
    private TrainingClassRepository repository;

    public TrainingClassDTO createTrainingClass(CreateTrainingClassCommand command) {
        TrainingClass trainingClass = new TrainingClass(command.getTitle(), command.getStart_date(), command.getEnd_date());
        repository.save(trainingClass);
        return modelMapper.map(trainingClass, TrainingClassDTO.class);
    }

    public List<TrainingClassDTO> getTrainingClasses(){
        return repository.findAll().stream()
                .map(m->modelMapper.map(m, TrainingClassDTO.class))
                .collect(Collectors.toList());
    }
}
