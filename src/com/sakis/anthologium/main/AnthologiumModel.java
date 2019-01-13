/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sakis.anthologium.main;

import com.sakis.anthologium.util.Database;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author isaaktosounidis
 */
public class AnthologiumModel {

    Connection connection;

    public AnthologiumModel() {

        // set connection to Datanase.connection and establish connection
        try {
            this.connection = Database.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // if no connection exit the program
        if (this.connection == null) {
            System.exit(1);
        }

        // look up database for the tables, if they do not
        // exit, create them
        if (!Database.tableExists("actor")) {
            Database.createTableActor();
        }
        if (!Database.tableExists("photo")) {
            Database.createTablePhoto();
        }
        if (!Database.tableExists("actor_photo")) {
            Database.createTableActorPhoto();
        }
        if (!Database.tableExists("songs")) {
            Database.createTableSongs();
        }
        if (!Database.tableExists("song_url")) {
            Database.createTableSongURLs();
        }
    }

}
