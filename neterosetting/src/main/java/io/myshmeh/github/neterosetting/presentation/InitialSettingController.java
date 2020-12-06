package io.myshmeh.github.neterosetting.presentation;

import io.myshmeh.github.neterosetting.application.usecase.InitialSettingManagementService;
import io.myshmeh.github.neterosetting.presentation.model.InitialSettingRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/setting/initialization")
public class InitialSettingController {
    InitialSettingManagementService initialSettingManagementService;

    public InitialSettingController(InitialSettingManagementService initialSettingManagementService) {
        this.initialSettingManagementService = initialSettingManagementService;
    }

    @PostMapping
    public void register(@RequestBody InitialSettingRequest request) {
        initialSettingManagementService.register(request);
    }
}
