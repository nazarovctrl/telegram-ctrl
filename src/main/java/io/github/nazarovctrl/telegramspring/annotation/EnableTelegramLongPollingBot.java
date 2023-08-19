package io.github.nazarovctrl.telegramspring.annotation;

import io.github.nazarovctrl.telegramspring.bot.BotInitializer;
import io.github.nazarovctrl.telegramspring.bot.SendMessageService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(EnableTelegramLongPollingBot.LongPollingConfig.class)
public @interface EnableTelegramLongPollingBot {
    @Configuration
    @ComponentScan(basePackages = "io.github.nazarovctrl.telegramspring.bot.longpolling",
            basePackageClasses = {BotInitializer.class, SendMessageService.class})
    class LongPollingConfig {
    }
}