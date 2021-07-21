package design.twitter.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="tweet")
public class Tweet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="message",nullable=false)
	private String message;
	@ManyToMany
	@JoinTable(
		name="tweet_tags",
		joinColumns = @JoinColumn(name="tweet_id"),
		inverseJoinColumns = @JoinColumn(name="hashtag_id"))
	private List<HashTag> tags;
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	@Column(name="likes",nullable=false,columnDefinition = "int default 0")
	private int likes;
	@Temporal(TemporalType.TIMESTAMP)   
	@Column(name = "postingtime", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date postingTime;
	
}
