package ru.fa.persistence.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "result")
public class Result {

    public Result(UUID id, String expression, String result) {
        this.id = id;
        this.expression = expression;
        this.result = result;
    }

    public Result() {}

    public static Result of(String expression, String result) {
        return new Result(UUID.randomUUID(), expression, result);
    }

    @Id
    @Column(columnDefinition = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(columnDefinition = "expression")
    private String expression;

    @Column(columnDefinition = "result")
    private String result;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
