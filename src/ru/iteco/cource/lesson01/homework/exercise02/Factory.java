package ru.iteco.cource.lesson01.homework.exercise02;

interface Factory {
    ItemDao createItemDao();

    CurrencyDao createCurrencyDao();
}
