package io.myshmeh.github.neterosetting.application.usecase;

import io.myshmeh.github.neterosetting.application.service.deliverable.setting.DeliverableSettingService;
import io.myshmeh.github.neterosetting.application.service.training.setting.TrainingSettingService;
import io.myshmeh.github.neterosetting.domain.deliverable.setting.DeliverableSetting;
import io.myshmeh.github.neterosetting.domain.training.TrainingID;
import io.myshmeh.github.neterosetting.domain.training.setting.TrainingSetting;
import org.springframework.stereotype.Service;

@Service
public class InitialSettingManagementService {
    TrainingSettingService trainingSettingService;
    DeliverableSettingService deliverableSettingService;

    public InitialSettingManagementService(TrainingSettingService trainingSettingService, DeliverableSettingService deliverableSettingService) {
        this.trainingSettingService = trainingSettingService;
        this.deliverableSettingService = deliverableSettingService;
    }

    public void register(InitialSettingAccessor initialSettingAccessor) {
        TrainingID trainingID = trainingSettingService.getNextTrainingID();
        System.out.println(trainingID.value());
        TrainingSetting trainingSetting = TrainingSettingFactory.create(initialSettingAccessor, trainingID);
        DeliverableSetting deliverableSetting = DeliverableSettingFactory.create(initialSettingAccessor, trainingID);

        trainingSettingService.register(trainingSetting);

        deliverableSettingService.register(deliverableSetting);
    }
}
