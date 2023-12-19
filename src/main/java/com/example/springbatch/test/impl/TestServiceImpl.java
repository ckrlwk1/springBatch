package com.example.springbatch.test.impl;

import com.example.springbatch.test.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public void test() {
        System.out.println("---------------------------------------- TestService::test");
    }
}
