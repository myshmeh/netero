package io.myshmeh.github.neterosetting.domain.training.setting;

import io.myshmeh.github.neterosetting.domain.training.TrainingID;

public class TrainingSetting {
    private TrainingID trainingID;
    private TrainingName trainingName;

    public TrainingSetting() {}

    public TrainingSetting(TrainingName trainingName) {
        this.trainingName = trainingName;
    }

    public TrainingSetting(TrainingID trainingID, TrainingName trainingName) {
        this.trainingID = trainingID;
        this.trainingName = trainingName;
    }

    public TrainingID trainingID() {
        return trainingID;
    }

    public TrainingName trainingName() {
        return trainingName;
    }
}
