package br.com.tech4music.musicasws.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4music.musicasws.model.Musica;
import br.com.tech4music.musicasws.shared.MusicaDTO;

public interface MusicaService {
    List<Musica> obterMusicas();
    Optional<MusicaDTO> obterPorId(String id);
    MusicaDTO adicionarMusica(Musica musica);
    void removerMusica(String id);
    Musica atualizarMusica(String id, Musica newMusica);
}
