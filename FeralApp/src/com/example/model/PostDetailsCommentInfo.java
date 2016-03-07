package com.example.model;

public class PostDetailsCommentInfo {
	
	public int getUserIcon() {
		return userIcon;
	}

	public void setUserIcon(int userIcon) {
		this.userIcon = userIcon;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public String getCommentTime() {
		return commentTime;
	}

	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}

	//用户评论帖子
	int userIcon;//....用户头像
   
   String commentContent;// 评论内容 
    
   String commentTime;/// 评论时间  
    
}
