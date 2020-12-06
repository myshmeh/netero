package io.myshmeh.github.neterosetting.infrastructure.deliverable.setting;

import io.myshmeh.github.neterosetting.domain.deliverable.setting.DeliverableSetting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DeliverableSettingMapper {
    void register(@Param("deliverableSetting") DeliverableSetting deliverableSetting);
}
