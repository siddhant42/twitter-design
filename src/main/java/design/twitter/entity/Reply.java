package design.twitter.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="reply")
public class Reply {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="message",nullable=false)
	private String message;
	@Column(name="parent_id",nullable=false)
	private int parentId;
	@Column(name="likes",nullable=false,columnDefinition = "int default 0")
	private int likes;
	@Temporal(TemporalType.TIMESTAMP)   
	@Column(name = "postingtime", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date postingtime;
}
