package com.myai.project.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.ai.chat.messages.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Msg {
    MessageType messageType;
    String text;
    Map<String, Object> metadata;
    List<AssistantMessage.ToolCall> toolCalls;

    public Msg(Message message) {
        this.messageType = message.getMessageType();
        this.text = message.getText();
        this.metadata = message.getMetadata();
        if(message instanceof AssistantMessage) {
            AssistantMessage am = (AssistantMessage) message;
            this.toolCalls = am.getToolCalls();
        }
    }

    public Message toMessage() {
        if (messageType == MessageType.SYSTEM) {
            return new SystemMessage(text);
        } else if (messageType == MessageType.USER) {
            return new UserMessage(text, Collections.emptyList(), metadata);
        } else if (messageType == MessageType.ASSISTANT) {
            return new AssistantMessage(text, metadata, toolCalls, Collections.emptyList());
        } else {
            throw new IllegalArgumentException("Unsupported message type: " + messageType);
        }
    }
}

