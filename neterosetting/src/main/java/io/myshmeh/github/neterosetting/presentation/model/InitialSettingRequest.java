package io.myshmeh.github.neterosetting.presentation.model;

import io.myshmeh.github.neterosetting.application.usecase.InitialSettingAccessor;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotNull;

public class InitialSettingRequest implements InitialSettingAccessor {
    @NotNull String trainingName;
    @NotNull int deliverableTarget;
    @NotNull String deliverableUnit;

    public InitialSettingRequest(@NotNull String trainingName, @NotNull int deliverableTarget, @NotNull String deliverableUnit) {
        this.trainingName = trainingName;
        this.deliverableTarget = deliverableTarget;
        this.deliverableUnit = deliverableUnit;
    }

    @Override
    public String trainingName() {
        return trainingName;
    }

    @Override
    public int deliverableTarget() {
        return deliverableTarget;
    }

    @Override
    public String deliverableUnit() {
        return deliverableUnit;
    }
}
