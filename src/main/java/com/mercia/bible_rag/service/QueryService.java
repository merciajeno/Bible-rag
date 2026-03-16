package com.mercia.bible_rag.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercia.bible_rag.model.QueryIntent;
import com.mercia.bible_rag.rag.QueryIntentDetector;

@Service
public class QueryService {

	@Autowired
	QueryIntentDetector queryIntentDetector;
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
                return "Searching scriptures for your question...";

            default:
                return "I'm not sure what you are asking. Please try again.";

        }
	}
}
