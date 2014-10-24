package com.gp.domain;

// Generated 19 sept. 2014 14:24:14 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name = "role", catalog = "gp")
public class Role implements java.io.Serializable {

	private Integer roleId;
	private String code;
	private String detail;
	private int num;
	private Set<Utilisateur> utilisateurs = new HashSet<Utilisateur>(0);

	public Role() {
	}

	public Role(String code, String detail, int num) {
		this.code = code;
		this.detail = detail;
		this.num = num;
	}

	public Role(String code, String detail, int num,
			Set<Utilisateur> utilisateurs) {
		this.code = code;
		this.detail = detail;
		this.num = num;
		this.utilisateurs = utilisateurs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "roleID", unique = true, nullable = false)
	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Column(name = "code", nullable = false, length = 100)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "detail", nullable = false, length = 65535)
	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Column(name = "num", nullable = false)
	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	public Set<Utilisateur> getUtilisateurs() {
		return this.utilisateurs;
	}

	public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

}
