package io.myshmeh.github.neterosetting.application.usecase;

import io.myshmeh.github.neterosetting.domain.deliverable.setting.DeliverableSetting;
import io.myshmeh.github.neterosetting.domain.deliverable.setting.DeliverableTarget;
import io.myshmeh.github.neterosetting.domain.deliverable.setting.DeliverableUnit;
import io.myshmeh.github.neterosetting.domain.training.TrainingID;

public class DeliverableSettingFactory {
    public static DeliverableSetting create(InitialSettingAccessor initialSettingAccessor, TrainingID trainingID) {
        return new DeliverableSetting(
                trainingID,
                new DeliverableTarget(initialSettingAccessor.deliverableTarget()),
                new DeliverableUnit(initialSettingAccessor.deliverableUnit())
        );
    }
}
