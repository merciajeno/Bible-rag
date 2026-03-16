package com.mercia.bible_rag.rag;

import org.springframework.stereotype.Component;

import com.mercia.bible_rag.model.QueryIntent;

@Component
public class QueryIntentDetector {

	public QueryIntent returnIntent(String request)
	{
		request = request.toLowerCase();
		if(request.contains("devotional"))return QueryIntent.DEVOTIONAL;
		else if (request.contains("story")) return QueryIntent.STORY;
		else if(request.contains("how")|| request.contains("why") || request.contains("what"))
			return QueryIntent.QUESTION;
			
		return QueryIntent.UNKNOWN;
	}
}
