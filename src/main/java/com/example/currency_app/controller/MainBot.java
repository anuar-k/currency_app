package com.example.currency_app.controller;


import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class MainBot {
//    BotConfig config;
//
//    public MainBot(BotConfig config) {
//        super(config.getToken());
//        this.config = config;
//    }
//
//    @Override
//    public void setUpdatesListener(UpdatesListener listener) {
//        System.out.println(this.config.getToken());
//        super.setUpdatesListener(listener);
//    }
//
//    @Override
//    public String getToken() {
//        return config.getToken();
//    }
//
//    @Override
//    public void setUpdatesListener(UpdatesListener listener, ExceptionHandler exceptionHandler, GetUpdates request) {
////        super.setUpdatesListener(listener, exceptionHandler, request);
////        listener.process()
////         if (listener.CONFIRMED_UPDATES_ALL == -1){
////
////         }
//    }

//    public static void start() {
//        String token = "6011400911:AAFGFe2gDQAc91laaucwf9yhTbwXhvzWTOM";
//
//        OkHttpClient client = new OkHttpClient();
//        TelegramBot bot = new TelegramBot.Builder(token).okHttpClient(client).build();
//
//        List<String> options = new ArrayList<>(Arrays.asList("/convert\n", "/kzt_to_usd\n", "/usd_to_kzt\n"));
//
//        List<BotCommand> commandList = new ArrayList<>();
//        commandList.add(new BotCommand("/start", "start "));
//        commandList.add(new BotCommand("/convert", "convert currency "));
//        commandList.add(new BotCommand("/help", "help  "));
//        try {
//            bot.execute(new SetMyCommands((BotCommand) commandList));
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        bot.setUpdatesListener(updates -> {
//            SendResponse response;

//            for (Update update : updates) {
//                long chatId = update.message().chat().id();
//                bot.execute(new SetMyCommands((BotCommand) commandList));
////                    response = bot.execute(new SendMessage(chatId, "Выберите вид услуг: " + options));
//                response = bot.execute(new SendMessage(chatId, ".|."));
//                System.out.println("response : " + response);
////                    String inputMessage = update.message().text();
////
////                    bot.execute(new SendMessage(chatId, "Converting: "));
////
//
//
////                    response = bot.execute(new SendMessage(chatId, "Выберите вид услуг: "));
//
//                // Send messages
////                    response = bot.execute(new SendMessage(chatId, "Выберите вид услуг: "  + options));
////                    Double value = null;
////
////                    String inputMessage = update.message().text();
////                    Double amount = Double.valueOf(inputMessage.split(" ")[0]);
////                    String to = inputMessage.split(" ")[1];
////
////                    if (inputMessage.equals("/convert")) {
////
//            }
//            return UpdatesListener.CONFIRMED_UPDATES_ALL;
//            return UpdatesListener.CONFIRMED_UPDATES_ALL;

//        }, e -> {
//            telegramExceptionHandler(e);
//        });
//        //Метод getUpdates возвращает 100 первых неподтвержденных обновлений.
//        GetUpdates getUpdates = new GetUpdates().limit(100).offset(0).timeout(0);
//        GetUpdatesResponse updatesResponse = bot.execute(getUpdates);
//        List<Update> updates = updatesResponse.updates();
//        for (Update update : updates) {
//            Message message = update.message();
//            System.out.println(message.text());
//        }
//    }

//    private static void telegramExceptionHandler(TelegramException e) {
//        if (e.response() != null) {
//            // got bad response from telegram
//            e.response().errorCode();
//            e.response().description();
//        } else {
//            // probably network error
//            e.printStackTrace();
//        }
//    }
}
