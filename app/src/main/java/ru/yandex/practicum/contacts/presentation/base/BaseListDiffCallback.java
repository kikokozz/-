package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

//import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public class BaseListDiffCallback<T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T> {

    @Override
    public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return oldItem.hashCode() == newItem.hashCode();
    }

    //public boolean theSameAs(@NonNull T oldItem, @NonNull T newItem) {
    //    return oldItem.hashCode() == newItem.hashCode();
    //}


    public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    public Object getChangePayload(@NonNull T oldItem, @NonNull T newItem) {
        return newItem;
    }


}