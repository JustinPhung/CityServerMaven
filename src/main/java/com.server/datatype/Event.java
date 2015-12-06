package com.server.datatype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by jp on 13.11.2015.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.MINIMAL_CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class Event {

        private int id;
        private String content;
        private long creationTime;
        private int likeCount;
        private int authorId;
        private boolean liked; //current user has already liked this post

        private int locationId;
        private int commentCount;



    public Event(int id, String content, long creationTime, int likeCount, int authorId, boolean liked, int locationId, int commentCount) {
        this.id = id;
        this.content = content;
        this.creationTime = creationTime;
        this.likeCount = likeCount;
        this.authorId = authorId;
        this.liked = liked;
        this.locationId = locationId;
        this.commentCount = commentCount;
    }

    public Event(com.server.entities.Event event, boolean liked){
        this.id = event.getId();
        this.content = event.getContent();
        this.creationTime = event.getDate().getTimeInMillis();
        this.likeCount = event.getLikes();
        this.authorId = event.getAppuserid();
        this.liked = liked;
        this.locationId = event.getLocation().getId();
        this.commentCount = event.getComments().size();
    }



    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public long getCreationTime() {
            return creationTime;
        }

        public void setCreationTime(long creationTime) {
            this.creationTime = creationTime;
        }

        public int getLikeCount() {
            return likeCount;
        }

        public void setLikeCount(int likeCount) {
            this.likeCount = likeCount;
        }

        public int getAuthorId() {
            return authorId;
        }

        public void setAuthorId(int authorId) {
            this.authorId = authorId;
        }

        public boolean isLiked() {
            return liked;
        }

        public void setLiked(boolean liked) {
            this.liked = liked;
        }

        public int getLocation() {
            return locationId;
        }

        public void setLocation(int locationId) {
            this.locationId = locationId;
        }

        public int getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(int commentCount) {
            this.commentCount = commentCount;
        }




}
