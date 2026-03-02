package com.deploy.praktikum1.util;

import jakarta.validation.Validator;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ValidationUtil {

    @Autowired
    private Validator validator;
}
