package com.example.tgmbot.service;

import com.example.tgmbot.bot.Bot;
import com.example.tgmbot.repo.UserRepo;
import com.example.tgmbot.service.handler.CallbackHandler;
import com.example.tgmbot.service.handler.CommandHandler;
import com.example.tgmbot.service.handler.MessageHandler;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults (level = AccessLevel.PRIVATE, makeFinal = true)
public class UpdateDispatcher {
    MessageHandler messageHandler;
    CallbackHandler callbackHandler;
    CommandHandler commandHandler;


    public BotApiMethod<?> distribute(Update update, Bot bot) {

        if (update.hasCallbackQuery()) {
            return callbackHandler.answer(update.getCallbackQuery(), bot);
        }
        if (update.hasMessage()) {
            var message = update.getMessage();
            if (message.hasText()) {
                if (message.getText().charAt(0) == '/') {
                    return commandHandler.answer(message, bot);
                }
                return messageHandler.answer(message, bot);
            }
        }
        log.warn("Unsupported update type: " + update);
        return null;
    }
}
