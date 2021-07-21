package design.twitter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class UserController implements IUserController {

	@Override
	@RequestMapping(value= {"/","/home"},method=RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		return mav;
	}
	@Override
	public ModelAndView getUserDetails(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView getFollwers(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView getFollowing(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView getFeed(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView getTweets(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView getRetweets(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView follow(int followId, int followingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView unfollow(int followId, int followingId) {
		// TODO Auto-generated method stub
		return null;
	}

}
