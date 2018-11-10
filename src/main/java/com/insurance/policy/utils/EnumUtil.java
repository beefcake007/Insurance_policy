package com.insurance.policy.utils;

import com.insurance.policy.enums.CodeEnum;

public class EnumUtil {

    /**
     * 通过code和枚举类型获取内容
     *
     * @param code
     * @param enumClass
     * @param <T>
     * @return
     */
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {//遍历枚举类型
            if (each.getCode().equals(code)) {
                return each;
            }
        }
        return null;
    }
}
