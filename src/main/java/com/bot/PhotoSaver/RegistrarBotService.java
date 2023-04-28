package com.bot.PhotoSaver;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Service
@AllArgsConstructor
public class RegistrarBotService {

    private FileSaverBot photoSaver;

    @Autowired
    private String addresses;
    public void makeRegistry() {
        try {
            register();
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private TelegramBotsApi register() throws TelegramApiException {
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        botsApi.registerBot(photoSaver);
        String[] list = addresses.split(",");
        for (String address : list) {
            photoSaver.sendMessage("Hi!", address);
        }
        return botsApi;
    }

    @PostConstruct
    public void init() {
        makeRegistry();
    }
}
