package io.myshmeh.github.neterosetting.domain.deliverable.setting;

import io.myshmeh.github.neterosetting.domain.training.TrainingID;

public class DeliverableSetting {
    private TrainingID trainingID;
    private DeliverableTarget deliverableTarget;
    private DeliverableUnit deliverableUnit;

    public DeliverableSetting() {
    }

    public DeliverableSetting(DeliverableTarget deliverableTarget, DeliverableUnit deliverableUnit) {
        this.deliverableTarget = deliverableTarget;
        this.deliverableUnit = deliverableUnit;
    }

    public DeliverableSetting(TrainingID trainingID, DeliverableTarget deliverableTarget, DeliverableUnit deliverableUnit) {
        this.trainingID = trainingID;
        this.deliverableTarget = deliverableTarget;
        this.deliverableUnit = deliverableUnit;
    }

    public TrainingID trainingID() {
        return trainingID;
    }

    public DeliverableTarget deliverableTarget() {
        return deliverableTarget;
    }

    public DeliverableUnit deliverableUnit() {
        return deliverableUnit;
    }
}
