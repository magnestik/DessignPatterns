package ru.iteco.cource.lesson01.homework.exercise02;

import java.util.UUID;

interface ItemDao {
    void create(Item item);

    Item read(UUID id);

    void update(Item item);

    void delete(Item item);
}
