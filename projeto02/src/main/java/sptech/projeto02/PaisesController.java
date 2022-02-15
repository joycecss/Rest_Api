package sptech.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/paises")
public class PaisesController {
    Pais pais = new Pais();

//    List<Pais> listaPaises = List.of(
//            new Pais("Brazil", 32,20,20),
//            new Pais("EUA", 10,20,43),
//            new Pais("Mexico", 34,65,12)
//    );

    List<Pais> listaPaises = new ArrayList<>();

    @GetMapping("/cadastrar/{nome}")
    public String cadastrarPais(@PathVariable String nome){
        listaPaises.add(new Pais(nome,0,0,0));
        return "Pais " + nome + " Cadastrado com sucesso ";
    }

    @GetMapping()
    public Pais setMedalhasOuro(){
        pais.setMedalhaOuro(4);
        pais.setMedalhaBronze(5);
        return pais;
    }

    @GetMapping({"/listar"})
    public List<Pais> getTodosPaises(){
        return listaPaises;
    }

    @GetMapping({"/buscar/{id}"})
    public Pais getPaisForId(@PathVariable Integer id){
       return listaPaises.get(id);
    }
}
