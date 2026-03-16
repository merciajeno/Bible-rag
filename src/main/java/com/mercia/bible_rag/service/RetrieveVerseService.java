package com.mercia.bible_rag.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mercia.bible_rag.model.Verse;

@Service
public class RetrieveVerseService {

	public List<Verse> searchVerses(String query) {

        // MOCK DATA (later replaced with vector search)

        List<Verse> verses = new ArrayList<>();

        verses.add(new Verse(
                "Isaiah 41:10",
                "Do not fear, for I am with you; do not be dismayed, for I am your God."
        ));

        verses.add(new Verse(
                "Joshua 1:9",
                "Be strong and courageous. Do not be afraid."
        ));

        return verses;
    }
}
