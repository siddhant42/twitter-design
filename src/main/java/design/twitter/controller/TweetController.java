package design.twitter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class TweetController implements ITweetController {

	@Override
	@RequestMapping(value="/tweet", method=RequestMethod.POST)
	public ModelAndView postTweet(String message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value="/tweet", method=RequestMethod.GET)
	public ModelAndView getTweetDetails(int tweetId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value="/reply", method=RequestMethod.POST)
	public ModelAndView postReply(String message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value="/reply", method=RequestMethod.GET)
	public ModelAndView getReplyDetails(int replyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value="/tweet/{tweetid}", method=RequestMethod.GET)
	public ModelAndView getTweetByTags(String tag) {
		// TODO Auto-generated method stub
		return null;
	}

}
