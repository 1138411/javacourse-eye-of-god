package com.jimisun.domain;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 08:18 2018-09-25
 * @Modified By:
 */
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(User.class);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "username", "user.username.required", "用户名不能为空");
        User user = (User) o;
        int length = user.getUsername().length();
        if (length > 10) {
            errors.rejectValue("username", "user.username.tolong", "用户名长度大于10");
        }
    }
}
