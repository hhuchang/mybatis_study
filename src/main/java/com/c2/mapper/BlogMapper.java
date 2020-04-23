package com.c2.mapper;

import com.c2.BlogModel.Blog;
import com.c2.BlogModel.Comment;

public interface BlogMapper {
    Comment selectComment(int post_id);
    Blog selecBlogDetails(int id);

}
