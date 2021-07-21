package design.twitter.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="user")
public class User {
	@Id
	private String username;
	@Column(name="name",nullable=false)
	private String name;
	@Column(name="phone")
	private String phone;
	@Column(name="email")
	private String email;
	@ManyToMany
	@JoinTable(
		name="follower_following",
		joinColumns = @JoinColumn(name="follower_userid"),
		inverseJoinColumns = @JoinColumn(name="following_userid"))
	private List<User> followers;
	@ManyToMany(mappedBy = "followers")
	private List<User> following;
}
