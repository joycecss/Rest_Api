package sptech.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class estudanteController {

    private String nomeAluno;
    private Double n1Aluno;
    private Double n2Aluno;

    @GetMapping({"/cadastrar-estudante/{nome}"})
    public String cadastrarAluno(@PathVariable String nome){
        nomeAluno = nome;
        return "Estudante " + nome + " cadastrado(a) com sucesso";
    }

    @GetMapping({"/cadastrar-notas/{n1}/{n2}"})
    public String cadastrarNotas(@PathVariable double n1,@PathVariable double n2){
        n1Aluno = n1;
        n2Aluno = n2;
        return "Notas cadastradas com sucesso";
    }
    @GetMapping({"/resultado"})
    public String resultado(){
       if(n1Aluno == null || n2Aluno == null || nomeAluno == null){
           return "Cadastre o nome e as notas antes";
       }
       double media = ((n1Aluno + n2Aluno) /2);
       if(media >= 6.0){
           return "Estudante aprovado com a média " + media;
       }else{
           return "Com a média " +  media + " infelizmente não há aprovação";
       }
    }
}
