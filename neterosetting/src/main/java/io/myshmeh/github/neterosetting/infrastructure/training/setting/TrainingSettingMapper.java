package io.myshmeh.github.neterosetting.infrastructure.training.setting;

import io.myshmeh.github.neterosetting.domain.training.TrainingID;
import io.myshmeh.github.neterosetting.domain.training.setting.TrainingSetting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TrainingSettingMapper {
    TrainingID getNextTrainingID();

    void register(@Param("trainingSetting") TrainingSetting trainingSetting);
}
