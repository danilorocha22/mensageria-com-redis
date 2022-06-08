package com.danilorocha.redis.publishers;

import com.danilorocha.redis.models.Produto;
import lombok.AllArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class Publisher {

    private RedisTemplate template;
    private ChannelTopic topic;

    @PostMapping("/publish")
    public String publish(@RequestBody Produto produto) {
        template.convertAndSend(topic.getTopic(), produto.toString());
        return "Evento publicado!";
    }
}
