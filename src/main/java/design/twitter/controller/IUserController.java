package design.twitter.controller;

import org.springframework.web.servlet.ModelAndView;

public interface IUserController {
//	public User getUserDetails(int userId);
//	public List<User> getFollwers(int userId);
//	public List<User> getFollowing(int userId);
//	public List<Tweet> getFeed(int userId);
//	public List<Tweet> getTweets(int userId);
//	public List<Retweet> getRetweets(int userId);
//	public void follow(int followId,int followingId);
//	public void unfollow(int followId,int followingId);
	public ModelAndView home();
	public ModelAndView getUserDetails(int userId);
	public ModelAndView getFollwers(int userId);
	public ModelAndView getFollowing(int userId);
	public ModelAndView getFeed(int userId);
	public ModelAndView getTweets(int userId);
	public ModelAndView getRetweets(int userId);
	public ModelAndView follow(int followId,int followingId);
	public ModelAndView unfollow(int followId,int followingId);
}
