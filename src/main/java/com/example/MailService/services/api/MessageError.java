package com.example.MailService.services.api;

public final class MessageError {
    private MessageError() {
    }


    public static final String BAD_REQUEST = "Запрос содержит некорретные данные. Измените запрос и отправьте его ещё раз ";

    public static final String SERVER_ERROR = "Сервер не смог корректно обработать запрос. Пожалуйста обратитесь к администратору ";

    public static final String EMPTY_LINE = "Пустая строка";

    public static final String FAIL_DOWNLOAD= "Не удалось скачать файл";

    public static final String SENDING_ERROR = "Ошибка при отправке";

    public static final String INCORRECT_UUID = "Неверный uuid";
}
