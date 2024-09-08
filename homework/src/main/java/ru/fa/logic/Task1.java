package ru.fa.logic;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import ru.fa.persistence.model.Result;
import ru.fa.persistence.repository.ResultRepository;

import java.util.Scanner;

@Service
public class Task1 {
    private final Scanner scanner;
    private final ResultRepository resultRepository;

    public Task1(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
        this.scanner = new Scanner(System.in);
    }

    @PostConstruct
    public void consoleListener() {
        System.out.println("gooo gooo gaaa gaa");
        while (true) {
            // TODO: само домашнее задание
            var action = scanner.nextInt();

            // Пример: сложение
            switch (action) {
                case 1 -> addition();
                default -> throw new RuntimeException("Неизвестное действие");
            }
        }
    }

    private void addition() {
        var firstValue = scanner.nextLong();
        var secondValue = scanner.nextLong();
        System.out.println(sum(firstValue, secondValue));
    }

    private long sum(long firstValue, long secondValue) {
        var summ = firstValue + secondValue;
        resultRepository.save(
                Result.of(
                        String.format("%d + %d", firstValue, secondValue),
                        Long.valueOf(summ).toString()));
        return summ;
    }
}
