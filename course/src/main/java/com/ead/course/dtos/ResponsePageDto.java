package com.ead.course.dtos;

import java.util.List;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class ResponsePageDto<T> extends PageImpl<T>{

	private static final long serialVersionUID = 1L;

	@JsonCreator(mode = Mode.PROPERTIES)
	public ResponsePageDto( @JsonProperty("content") List<T> content,
							@JsonProperty("number") int number,
							@JsonProperty("size") int size,
							@JsonProperty("totalElements") Long totalElements,
							@JsonProperty("pageable") JsonNode pageable,
							@JsonProperty("last") boolean last, 
							@JsonProperty("totalPages") int totalPages,
							@JsonProperty("sort") JsonNode sort,
							@JsonProperty("first") boolean first,
							@JsonProperty("empty") boolean empty) {
		
		super(content, PageRequest.of(number, size), totalElements);
	}
	
	public ResponsePageDto(List<T> content) {
		super(content);
		// TODO Auto-generated constructor stub
	}
	
	public ResponsePageDto(List<T> content, Pageable pageable, long total) {
		super(content, pageable, total);
		// TODO Auto-generated constructor stub
	}
}
