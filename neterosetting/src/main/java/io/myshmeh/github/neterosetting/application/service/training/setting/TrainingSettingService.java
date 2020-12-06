package io.myshmeh.github.neterosetting.application.service.training.setting;

import io.myshmeh.github.neterosetting.domain.training.TrainingID;
import io.myshmeh.github.neterosetting.domain.training.setting.TrainingSetting;
import io.myshmeh.github.neterosetting.domain.training.setting.TrainingSettingRepository;
import org.springframework.stereotype.Service;

@Service
public class TrainingSettingService {
    TrainingSettingRepository trainingSettingRepository;

    public TrainingSettingService(TrainingSettingRepository trainingSettingRepository) {
        this.trainingSettingRepository = trainingSettingRepository;
    }

    public void register(TrainingSetting trainingSetting) {
        trainingSettingRepository.register(trainingSetting);
    }

    public TrainingID getNextTrainingID() {
        return trainingSettingRepository.getNextID();
    }
}
