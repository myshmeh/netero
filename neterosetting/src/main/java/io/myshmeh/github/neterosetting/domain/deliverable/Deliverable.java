package io.myshmeh.github.neterosetting.domain.deliverable;

import io.myshmeh.github.neterosetting.domain.deliverable.date.DeliveredDate;
import io.myshmeh.github.neterosetting.domain.training.TrainingID;

public class Deliverable {
    private TrainingID trainingID;
    private DeliverableContent deliverableContent;
    private DeliveredDate deliveredDate;

    public Deliverable() {
    }

    public Deliverable(TrainingID trainingID, DeliverableContent deliverableContent, DeliveredDate deliveredDate) {
        this.trainingID = trainingID;
        this.deliverableContent = deliverableContent;
        this.deliveredDate = deliveredDate;
    }

    public TrainingID trainingID() {
        return trainingID;
    }

    public DeliverableContent deliverableContent() {
        return deliverableContent;
    }

    public DeliveredDate deliveredDate() {
        return deliveredDate;
    }
}
