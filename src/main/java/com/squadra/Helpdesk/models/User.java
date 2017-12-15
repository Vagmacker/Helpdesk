package com.squadra.Helpdesk.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Construtor padrão da classe.
	 */
	public User() {
	}

	/**
	 * Construtor de classe.
	 * 
	 * @param id
	 * @param name
	 * @param lastName
	 * @param email
	 * @param password
	 * @param active
	 */
	public User(Long id, String name, String lastName, String email, String password, boolean active) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.active = active;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column()
	private Long id;

	@Column()
	@NotEmpty(message = "Não pode ser vazio")
	private String name;

	@Column()
	@NotEmpty(message = "Não pode ser vazio")
	private String lastName;

	@Column()
	@Email(message = "Por favor informe um e-mail válido")
	@NotEmpty(message = "Não pode ser vazio")
	private String email;

	@Column()
	@NotEmpty(message = "Não pode ser vazio")
	@Length(min = 4, message = "Minimo de 5 caracter")
	private String password;

	@Column()
	private boolean active;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
