package br.com.example.meuprimeiroexemplo.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DefaultModel {

    private Integer count;
    private String next;
    private String previous;
    private List<People> results = new ArrayList<>();

}