package design.twitter.controller;

import org.springframework.web.servlet.ModelAndView;

public interface ITweetController {
//	public boolean postTweet(String message);
//	public Tweet getTweetDetails(int tweetId);
//	public boolean postReply(String message);
//	public Reply getReplyDetails(int replyId);
//	public List<Tweet> getTweetByTags(String tag);
	public ModelAndView postTweet(String message);
	public ModelAndView getTweetDetails(int tweetId);
	public ModelAndView postReply(String message);
	public ModelAndView getReplyDetails(int replyId);
	public ModelAndView getTweetByTags(String tag);
}
