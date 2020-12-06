package io.myshmeh.github.neterosetting.application.usecase;

import io.myshmeh.github.neterosetting.presentation.model.InitialSettingRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Rollback
public class InitialSettingManagementServiceTest {
    @Autowired
    InitialSettingManagementService sut;

    @Test
    public void canRegisterInitialSetting() {
        InitialSettingRequest request = new InitialSettingRequest("get super fit body", 20, "pushups");
        sut.register(request);
    }
}
