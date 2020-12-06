package io.myshmeh.github.neterosetting.application.service.deliverable.setting;

import io.myshmeh.github.neterosetting.domain.deliverable.setting.DeliverableSetting;
import io.myshmeh.github.neterosetting.domain.deliverable.setting.DeliverableSettingRepository;
import org.springframework.stereotype.Service;

@Service
public class DeliverableSettingService {
    DeliverableSettingRepository deliverableSettingRepository;

    public DeliverableSettingService(DeliverableSettingRepository deliverableSettingRepository) {
        this.deliverableSettingRepository = deliverableSettingRepository;
    }

    public void register(DeliverableSetting deliverableSetting) {
        deliverableSettingRepository.register(deliverableSetting);
    }
}
