package io.myshmeh.github.neterosetting.infrastructure.training.setting;

import io.myshmeh.github.neterosetting.domain.training.TrainingID;
import io.myshmeh.github.neterosetting.domain.training.setting.TrainingSetting;
import io.myshmeh.github.neterosetting.domain.training.setting.TrainingSettingRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TrainingSettingDataSource implements TrainingSettingRepository {
    TrainingSettingMapper mapper;

    public TrainingSettingDataSource(TrainingSettingMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public TrainingID getNextID() {
        return mapper.getNextTrainingID();
    }

    @Override
    public void register(TrainingSetting setting) {
        mapper.register(setting);
    }
}
