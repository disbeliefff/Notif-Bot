package com.example.tgmbot.service.handler;

import com.example.tgmbot.bot.Bot;
import com.example.tgmbot.service.contract.AbstractHandler;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CallbackHandler extends AbstractHandler {

    @Override
    public BotApiMethod<?> answer(BotApiObject object, Bot bot) {
        var query = (CallbackQuery) object;
        throw new UnsupportedOperationException();
    }
}
