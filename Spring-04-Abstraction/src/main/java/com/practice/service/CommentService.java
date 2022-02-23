package com.practice.service;

import com.practice.model.Comment;
import com.practice.proxy.CommentNotificationProxy;
import com.practice.proxy.CommentPushNotificationProxy;
import com.practice.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;
  //  private  final CommentPushNotificationProxy commentPushNotificationProxy;

    public CommentService(CommentRepository commentRepository, @Qualifier("Push")CommentNotificationProxy commentNotificationProxy  /*CommentPushNotificationProxy commentPushNotificationProxy*/) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
       // this.commentPushNotificationProxy = commentPushNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
