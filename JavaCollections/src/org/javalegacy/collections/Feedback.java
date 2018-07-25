package org.javalegacy.collections;

public class Feedback {

	int userId;
	int feedbackRating;
	String feedbackComments;
	public Feedback(int userId, int feedbackRating) {
		super();
		this.userId = userId;
		this.feedbackRating = feedbackRating;
	}
	public Feedback(int userId, int feedbackRating, String feedbackComments) {
		super();
		this.userId = userId;
		this.feedbackRating = feedbackRating;
		this.feedbackComments = feedbackComments;
	}
	@Override
	public String toString() {
		return "Feedback [userId=" + userId + ", feedbackRating=" + feedbackRating + ", feedbackComments="
				+ feedbackComments + "]";
	};
	
}
