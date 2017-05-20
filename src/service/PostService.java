/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lab5.Area;
import lab5.DbManager;
import lab5.JFrame;
import lab5.Post;

/**
 *
 * @author ДНС
 */
public class PostService extends AbService<Post> {

    public PostService() {
    }

    public PostService(DbManager dbManager) {
        super(dbManager);
    }

    @Override
    public void add(Post entity) throws SQLException {
        try {
            String str = "INSERT INTO post " + " values('" + entity.getId() + "','" + entity.getPost() + "');";
            dbManager.executeUpdate(str);
        } catch (SQLException ex) {
            throw ex;
        }
    }

    @Override
    public ArrayList<Post> all() throws SQLException {
        ArrayList<Post> posts = null;
        try {
            posts = new ArrayList<>();
            posts.add(null);
            ResultSet rs = dbManager.executeQuery("SELECT * FROM post");
            while (rs.next()) {
                Post post = new Post();
                post.setId(rs.getLong("id_post"));
                post.setPost(rs.getString("post"));
                posts.add(post);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return posts;
    }

}
