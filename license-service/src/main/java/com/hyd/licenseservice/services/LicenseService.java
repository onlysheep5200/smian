package com.hyd.licenseservice.services;

import com.hyd.licenseservice.models.License;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @Author 黄耀东 【 huangyaodong@meituan.com 】
 * @Date 17/12/28 下午8:53
 * @Description
 */
@Service
public class LicenseService {


    public License getLicense(String licenseId){
        return new License()
                .withId(licenseId)
                .withOrganizationId( UUID.randomUUID().toString() )
                .withProductName("Test Product Name")
                .withLicenseType("PerSeat");
    }

    public void saveLicense(License license){

    }

    public void updateLicense(License license){

    }

    public void deleteLicense(License license){

    }

}

