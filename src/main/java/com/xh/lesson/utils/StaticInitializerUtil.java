package com.xh.lesson.utils;


import org.springframework.stereotype.Component;

/**
 * @ClassName: StaticContextInitializer
 */
@Component
public class StaticInitializerUtil {
   private TokenSettings tokenSettings;

    public StaticInitializerUtil(TokenSettings tokenSettings) {
        JwtTokenUtil.setTokenSettings(tokenSettings);
    }
}
