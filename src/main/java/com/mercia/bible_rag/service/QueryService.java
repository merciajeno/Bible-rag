package com.mercia.bible_rag.service;

import org.springframework.stereotype.Service;

@Service
public class QueryService {

	public String generateResponse(String question)
	{
		// later will add rag based responses
		return "Read Bible";
	}
}
