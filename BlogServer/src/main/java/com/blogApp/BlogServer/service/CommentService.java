package com.blogApp.BlogServer.service;

import java.util.List;

import com.blogApp.BlogServer.entity.Comment;

public interface CommentService {

	Comment createComment(Long postId,String postedBy,String content);
	List<Comment> getCommentsByPostId(Long postId);
}
