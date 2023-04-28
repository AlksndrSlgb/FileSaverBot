package com.bot.PhotoSaver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

@Component
public class Config {

    @Value("${user.addresses}")
    private String addresses;

    @Bean
    public SendMessage sendMessage() {
        return new SendMessage();
    }

    @Bean("addresses")
    public String getAddresses() {
        return addresses;
    }
}
