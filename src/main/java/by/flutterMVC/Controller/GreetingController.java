package by.flutterMVC.Controller;


import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import by.flutterMVC.Service.BoardRepository;
import by.flutterMVC.Service.PersonRepository;
import by.flutterMVC.Vo.Board;
import by.flutterMVC.Vo.Greeting;
import by.flutterMVC.Vo.Person;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class GreetingController {

    @Resource
    private PersonRepository personRepository;

    @Resource
    private BoardRepository boardRepository;
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public List<Board> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return boardRepository.findAll();
    }
}