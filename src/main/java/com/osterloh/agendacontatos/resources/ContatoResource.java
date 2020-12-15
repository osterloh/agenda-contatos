package com.osterloh.agendacontatos.resources;

import com.osterloh.agendacontatos.models.Contato;
import com.osterloh.agendacontatos.repository.ContatoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Contatos")
@CrossOrigin(origins = "*")
public class ContatoResource {

    @Autowired
    ContatoRepository contatoRepository;

    @GetMapping("/contatos")
    @ApiOperation(value = "Retorna uma lista de contatos")
    public List<Contato> listaContatos(){
        return contatoRepository.findAll();
    }

    @GetMapping("/contatos/{id}")
    @ApiOperation(value = "Retorna um contato único")
    public Contato listaContatoId(@PathVariable(value = "id") UUID id){
        return contatoRepository.findById(id);
    }

    @PostMapping("/contato")
    @ApiOperation(value = "Este metodo salva um contato")
    public Contato salvaContato(@RequestBody Contato contato){
        return contatoRepository.save(contato);
    }

    @DeleteMapping("/contato")
    @ApiOperation(value = "Este método deleta um contato")
    public void deletaContato(@RequestBody Contato contato){
        contatoRepository.delete(contato);
    }

    @PutMapping("/contato")
    @ApiOperation(value = "Este método atualiza um contato")
    public Contato updateContato(@RequestBody Contato contato){
        return contatoRepository.save(contato);
    }
}
