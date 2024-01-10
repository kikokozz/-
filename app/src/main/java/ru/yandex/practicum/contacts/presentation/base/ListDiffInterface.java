package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {

    boolean theSameAs(T someObject);

    @Override
    boolean equals(Object object);


}
