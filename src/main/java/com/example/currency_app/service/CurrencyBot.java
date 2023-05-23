package com.example.currency_app.service;

import com.example.currency_app.config.BotConfig;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Slf4j
@Data
@Component
public class CurrencyBot extends TelegramLongPollingBot {
    private BotConfig config;

    public CurrencyBot(BotConfig config) {
        this.config = config;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();
            String firsName = update.getMessage().getChat().getFirstName();
//            sendMessage(chatId, "Command not found");

            switch (messageText) {
                case "/start": {
                    startCommandReceived(chatId, firsName);
                    break;
                }
                default: {
                    sendMessage(chatId, "Command not found");
                    break;
                }
            }
        }
    }

    public void startCommandReceived(Long chatId, String name) {
        String answer = "Hi, " + name + " nice to meet you!";
        sendMessage(chatId, answer);
        log.info(" Replied to user :" + name);
    }

    public void sendMessage(Long chatId, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(String.valueOf(chatId));
        sendMessage.setText(text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            log.error(e.getMessage());
        }
    }

    @Override
    public String getBotToken() {
        return config.getToken();
    }

    @Override
    public String getBotUsername() {
        return config.getBotName();
    }
}
