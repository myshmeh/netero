package io.myshmeh.github.neterosetting.domain.training;

import io.myshmeh.github.neterosetting.domain.training.setting.TrainingName;

public class Training {
    private TrainingID trainingID;
    private TrainingName trainingName;

    public Training() {
    }

    public Training(TrainingID trainingID, TrainingName trainingName) {
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
