package org.atwjsw.rest.webservices.restfulwebservices.user;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ApiModel(description = "All details about the user.")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

	@Id
	@GeneratedValue
	private Integer id;

	@Size(min = 2, message = "At least 2 characters")
	@ApiModelProperty(notes = "Name should have at least 2 characters")
	private String name;

	@Past
	@ApiModelProperty(notes = "Birth date should be in the past")
	private Date birthDate;

	@OneToMany(mappedBy = "user")
	private List<Post> posts;

	public User(Integer id, @Size(min = 2, message = "At least 2 characters") String name, @Past Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

}
