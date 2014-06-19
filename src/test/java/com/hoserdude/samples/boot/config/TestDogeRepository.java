package com.hoserdude.samples.boot.config;

public class TestDogeRepository implements DogeRepository {
    @Override
    public String getDogeData() {
        return "wow";
    }
}
