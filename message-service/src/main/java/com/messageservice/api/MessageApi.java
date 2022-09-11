package com.messageservice.api;

import com.messageservice.dto.MessageDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/message")
public interface MessageApi {
    @PostMapping
    ResponseEntity<Void> sendMessage(@RequestBody MessageDto message);

    @GetMapping("/room/{roomId}")
    List<MessageDto> showMessages(@PathVariable Long roomId);

    @PostMapping("/emit")
    ResponseEntity<String> emit(@RequestBody String message);
}
