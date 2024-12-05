package com.mostafa.whatsapp.messaging.domain.message.vo;


import com.mostafa.whatsapp.shared.error.domain.Assert;

public record ConversationName(String name) {

    public ConversationName {
        Assert.field("name", name).minLength(3).maxLength(255);
    }
}
