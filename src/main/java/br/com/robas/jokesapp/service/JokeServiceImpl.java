package br.com.robas.jokesapp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {
    // final object to avoid recreation on every request
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}