package com.apidio.dioapi.Service;

import com.apidio.dioapi.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id,Cliente cliente);

    void deletar(Long id);
}
