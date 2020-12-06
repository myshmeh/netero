package io.myshmeh.github.neterosetting.domain.training.setting;

import io.myshmeh.github.neterosetting.domain.deliverable.setting.DeliverableSetting;
import io.myshmeh.github.neterosetting.domain.training.TrainingID;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingSettingRepository {
    TrainingID getNextID();

    void register(TrainingSetting trainingSetting);
}
