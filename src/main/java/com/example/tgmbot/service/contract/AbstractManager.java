package com.example.tgmbot.service.contract;

import com.example.tgmbot.bot.Bot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;

public abstract class AbstractManager {

    public abstract BotApiMethod<?> mainMenu (Message message, Bot bot);

    public abstract BotApiMethod<?> callbackMenu (CallbackQuery callback, Bot bot);
}


