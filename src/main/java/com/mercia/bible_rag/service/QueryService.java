package com.mercia.bible_rag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercia.bible_rag.model.QueryIntent;
import com.mercia.bible_rag.model.Verse;
import com.mercia.bible_rag.rag.QueryIntentDetector;

@Service
public class QueryService {

	@Autowired
	QueryIntentDetector queryIntentDetector;
	
	@Autowired
	RetrieveVerseService retrieveVerseService;
	
	public String generateResponse(String question)
	{
		// later will add rag based responses
		QueryIntent intent = queryIntentDetector.returnIntent(question);

        switch(intent) {

            case DEVOTIONAL:
                return "Generating a devotional based on scripture...";

            case STORY:
                return "Finding a motivational story from the Bible...";

            case QUESTION:
            	List<Verse> verses = retrieveVerseService.searchVerses(question);

                StringBuilder response = new StringBuilder();

                for(Verse verse : verses) {
                    response.append(verse.getReference())
                            .append(" - ")
                            .append(verse.getText())
                            .append("\n\n");
                }

                return response.toString();

            default:
                return "I'm not sure what you are asking. Please try again.";

        }
	}
}
