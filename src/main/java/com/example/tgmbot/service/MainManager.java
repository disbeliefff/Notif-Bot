package com.example.tgmbot.service;

import com.example.tgmbot.bot.Bot;
import com.example.tgmbot.service.contract.AbstractManager;
import com.example.tgmbot.service.contract.CommandListener;
import com.example.tgmbot.service.contract.QueryListener;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MainManager extends AbstractManager implements CommandListener, QueryListener {

    @Override
    public BotApiMethod<?> mainMenu(Message message, Bot bot) {
        return null;
    }

    @Override
    public BotApiMethod<?> callbackMenu(CallbackQuery callback, Bot bot) {
        return null;
    }

    @Override
    public BotApiMethod<?> answerCommand(Message message, Bot bot) {
        return greetings(message.getChatId());
    }

    @Override
    public BotApiMethod<?> answerQuery(CallbackQuery query, Bot bot) {
        return null;
    }

    private BotApiMethod<?> greetings (Long chatId) {
        return SendMessage.builder()
                .chatId(chatId)
                .text("Hello")
                .build();
    }
}
