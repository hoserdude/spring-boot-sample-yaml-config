package com.hoserdude.samples.boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogeService {

    @Autowired
    private DogeSettings dogeSettings;

    @Autowired
    private DogeRepository dogeRepository;

    public boolean requiresDogeness() {
        if (dogeSettings.getWow() > 5 && dogeSettings.isVery() == true) {
            return true;
        }
        return false;
    }

    public String leDoge() {
        return dogeRepository.getDogeData();
    }
}
