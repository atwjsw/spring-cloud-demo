package org.atwjsw.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonFilter("SomeBeanFilter")
// @JsonIgnoreProperties(value = { "field1", "field2" })
public class SomeBean {

	private String field1;

	// @JsonIgnore
	private String field2;

	// @JsonIgnore
	private String field3;

}
