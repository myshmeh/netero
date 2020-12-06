package io.myshmeh.github.neterosetting.infrastructure.deliverable.setting;

import io.myshmeh.github.neterosetting.domain.deliverable.setting.DeliverableSetting;
import io.myshmeh.github.neterosetting.domain.deliverable.setting.DeliverableSettingRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DeliverableSettingDataSource implements DeliverableSettingRepository {
    DeliverableSettingMapper mapper;

    public DeliverableSettingDataSource(DeliverableSettingMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void register(DeliverableSetting setting) {
        mapper.register(setting);
    }
}
