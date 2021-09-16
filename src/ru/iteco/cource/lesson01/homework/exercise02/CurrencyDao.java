package ru.iteco.cource.lesson01.homework.exercise02;

import java.util.UUID;

public interface CurrencyDao {
    void create(Currency currency);
    Currency read(UUID id);
    void update(Currency currency);
    void delete(Currency currency);
}

