package io.myshmeh.github.neterosetting.application.usecase;

import io.myshmeh.github.neterosetting.domain.training.TrainingID;
import io.myshmeh.github.neterosetting.domain.training.setting.TrainingName;
import io.myshmeh.github.neterosetting.domain.training.setting.TrainingSetting;

public class TrainingSettingFactory {
    public static TrainingSetting create(InitialSettingAccessor initialSettingAccessor, TrainingID trainingID) {
        return new TrainingSetting(
                trainingID,
                new TrainingName(initialSettingAccessor.trainingName())
        );
    }
}
